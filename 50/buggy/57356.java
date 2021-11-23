@org.springframework.context.annotation.Bean
private org.springframework.amqp.core.TopicExchange exchange() {
    java.lang.System.out.println("Creating TopicExchange.");
    return new org.springframework.amqp.core.TopicExchange("spring-boot-exchange");
}