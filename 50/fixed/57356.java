@org.springframework.context.annotation.Bean
private org.springframework.amqp.core.TopicExchange exchange() {
    return new org.springframework.amqp.core.TopicExchange("spring-boot-exchange");
}