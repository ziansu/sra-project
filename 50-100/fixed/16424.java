private boolean endService() {
    synchronized(this) {
        this.done = true;
    }
    org.normandra.orientdb.OrientNonBlockingListener.logger.debug("Adding end-of-service item to queue.");
    for (int i = 0; i < 10; i++) {
        try {
            if (queue.offer(new org.normandra.orientdb.OrientNonBlockingListener.EndOfServiceElement(), 500, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                return true;
            }
        } catch (final java.lang.InterruptedException e) {
            org.normandra.orientdb.OrientNonBlockingListener.logger.debug("Unable to offer document in non-blocking queue.", e);
        }
    }
    org.normandra.orientdb.OrientNonBlockingListener.logger.debug("Unable to add end-of-service item to queue.");
    return false;
}