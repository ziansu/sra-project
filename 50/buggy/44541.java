@org.springframework.context.annotation.Bean
public org.springframework.amqp.core.AmqpTemplate amqpTemplate() {
    lombok.val template = new org.springframework.amqp.rabbit.core.RabbitTemplate(connectionFactory);
    template.setMessageConverter(jsonMessageConverter());
    return template;
}