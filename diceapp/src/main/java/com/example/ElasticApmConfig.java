package com.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

import co.elastic.apm.attach.ElasticApmAttacher;
import jakarta.annotation.PostConstruct;

@Configuration
@ConditionalOnProperty(value = "elastic.apm.enabled", havingValue = "true")
public class ElasticApmConfig {
    @PostConstruct
    public void init() {
        ElasticApmAttacher.attach();
    }
}

