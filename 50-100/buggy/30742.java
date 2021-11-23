@java.lang.Override
public void sendMessageToQueue(eu.domibus.api.jms.JmsMessage message, javax.jms.Queue destination) {
    try {
        message.getProperties().put(JmsMessage.PROPERTY_ORIGINAL_QUEUE, removeJmsModule(destination.getQueueName()));
    } catch (javax.jms.JMSException e) {
        eu.domibus.messaging.jms.JMSManagerImpl.LOG.warn((("Could not add the property [" + (eu.domibus.api.jms.JmsMessage.PROPERTY_ORIGINAL_QUEUE)) + "] on the destination"), e);
    }
    eu.domibus.jms.spi.InternalJmsMessage internalJmsMessage = jmsMessageMapper.convert(message);
    internalJmsManager.sendMessage(internalJmsMessage, destination);
}