public void send(java.lang.String routingKey, com.superid.MessageFormat messageFormat) {
    if (routingKey.equals("")) {
        com.superid.MessageFormatSender.logger.warn("Using default routing key, you need routing key for your RabbitTemplate");
    }
    if (rabbitTemplate.getExchange().equals("")) {
        com.superid.MessageFormatSender.logger.warn("Using default routing key, you may need setting exchange for your RabbitTemplate");
    }
    rabbitTemplate.convertAndSend(routingKey, messageFormat.toJson());
}