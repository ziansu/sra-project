private void proceedDeliver(org.apache.activemq.artemis.core.server.Consumer consumer, org.apache.activemq.artemis.core.server.MessageReference reference) {
    try {
        consumer.proceedDeliver(reference);
    } catch (java.lang.Throwable t) {
        ActiveMQServerLogger.LOGGER.removingBadConsumer(t, consumer, reference);
        synchronized(this) {
            try {
                removeConsumer(consumer);
            } catch (java.lang.Exception e) {
                ActiveMQServerLogger.LOGGER.errorRemovingConsumer(e);
            }
            addHead(reference);
        }
    } finally {
        deliveriesInTransit.countDown();
    }
}