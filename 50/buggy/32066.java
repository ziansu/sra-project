public boolean pusher(final java.lang.String itemToQueue, int timeout, java.util.concurrent.TimeUnit period) {
    try {
        com.karlmutch.QueueBasedStack.sProducerQueue.offer(itemToQueue, timeout, period);
        return true;
    } catch (java.lang.InterruptedException ignoredException) {
        java.lang.Thread.interrupted();
    }
    return false;
}