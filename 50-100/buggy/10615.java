public void sendConfig(java.lang.String apiKey, java.lang.String config) {
    try {
        org.springframework.amqp.core.MessageProperties properties = new org.springframework.amqp.core.MessageProperties();
        properties.setHeader(RabbitMQConfig.MSG_HEADER_APIKEY, apiKey);
        org.springframework.amqp.core.Message message = new org.springframework.amqp.core.Message("".getBytes("UTF-8"), properties);
        rabbitTemplate.convertAndSend("mgmt.config.sub", message);
    } catch (org.springframework.amqp.AmqpException | java.io.UnsupportedEncodingException ex) {
        com.konkerlabs.platform.registry.integration.gateways.RabbitGateway.LOGGER.error("AmqpException while sending message to RabbitMQ...", ex);
    }
}