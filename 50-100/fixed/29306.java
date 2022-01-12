private org.hornetq.api.core.client.ClientMessage createClientMessage(pl.edu.agh.ki.to2.monitor.contract.Event event) {
    org.hornetq.api.core.client.ClientMessage message;
    synchronized(session) {
        message = session.createMessage(pl.edu.agh.ki.to2.monitor.messaging.InMemoryMessageQueue.MESSAGE_DURABLE_PROP);
    }
    message.putIntProperty(pl.edu.agh.ki.to2.monitor.messaging.InMemoryMessageQueue.AMOUNT_PROPERTY_KEY, event.getAmount());
    message.putStringProperty(pl.edu.agh.ki.to2.monitor.messaging.InMemoryMessageQueue.TYPE_PROPERTY_KEY, event.getType().toString());
    message.putLongProperty(pl.edu.agh.ki.to2.monitor.messaging.InMemoryMessageQueue.TIMESTAMP_PROPERTY_KEY, event.getTimestamp());
    return message;
}