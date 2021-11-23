public synchronized void cancel(final org.hornetq.core.server.MessageReference reference, final long timeBase) throws java.lang.Exception {
    deliveringCount.decrementAndGet();
    if (checkRedelivery(reference, timeBase)) {
        if (!(scheduledDeliveryHandler.checkAndSchedule(reference, false))) {
            internalAddHead(reference);
        }
        resetAllIterators();
    }
}