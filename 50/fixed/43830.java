public void consumeBatchWhenAvailable(com.lmax.disruptor.EventHandler<java.lang.Object> handler) {
    try {
        consumeBatchToCursor(handler);
    } catch (java.lang.InterruptedException e) {
        throw new java.lang.RuntimeException(e);
    }
}