private void proceedDeliver(org.apache.activemq.artemis.core.server.Consumer consumer, org.apache.activemq.artemis.core.server.MessageReference reference) {
    try {
        consumer.proceedDeliver(reference);
        deliveriesInTransit.countDown();
    } catch (java.lang.Throwable t) {
        deliveriesInTransit.countDown();
        ActiveMQServerLogger.LOGGER.removingBadConsumer(t, consumer, reference);
        synchronized(this) {
            try {
                removeConsumer(consumer);
            } catch (java.lang.Exception e) {
                ActiveMQServerLogger.LOGGER.errorRemovingConsumer(e);
            }
            addHead(reference);
        }
    }
}