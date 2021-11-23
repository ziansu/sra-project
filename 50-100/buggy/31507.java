public void packAndSend(java.lang.String receiver, com.maxxton.aam.messages.BaseMessage baseMessage, java.lang.String responseTo) {
    org.springframework.amqp.core.MessageProperties properties = new org.springframework.amqp.core.MessageProperties();
    properties.setCorrelationId(((responseTo == null) || (responseTo == "") ? java.util.UUID.randomUUID().toString().getBytes() : responseTo.getBytes()));
    byte[] messageBytes = com.maxxton.aam.communication.MessageSerializer.serialize(baseMessage);
    org.springframework.amqp.core.Message message = new org.springframework.amqp.core.Message(messageBytes, properties);
    objSender.sendMessage(receiver, message);
}