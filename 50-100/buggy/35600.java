public void addSendMessage(org.springframework.amqp.core.Message message) {
    if (com.maxxton.aam.resources.Validator.checkObject(message, org.springframework.amqp.core.Message.class)) {
        if (((message.getMessageProperties().getCorrelationId()) != null) && ((message.getMessageProperties().getCorrelationId().length) > 0)) {
            this.mapSendMessages.put(this.mapSendMessages.size(), message);
            this.addIdentifier(message.getMessageProperties().getCorrelationId().toString());
        }
    }
}