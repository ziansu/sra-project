private org.hornetq.api.core.client.ClientMessage tryPop() {
    org.hornetq.api.core.client.ClientMessage message = null;
    try {
        synchronized(consumer) {
            message = consumer.receive();
        }
    } catch (org.hornetq.api.core.HornetQException e) {
        pl.edu.agh.ki.to2.monitor.messaging.InMemoryMessageQueue.LOGGER.error("Exception while receiving message", e);
    }
    return message;
}