public void run() {
    try {
        log.debug("Inference thread spawned");
        toulbar2Call.call();
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    } finally {
        synchronized(this) {
            notifyAll();
        }
        log.debug("Inference thread completed");
    }
}