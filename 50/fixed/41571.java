@org.springframework.context.annotation.Bean
public org.springframework.kafka.core.KafkaTemplate<java.lang.String, java.lang.String> kafkaTemplate() {
    return new org.springframework.kafka.core.KafkaTemplate(producerFactory());
}