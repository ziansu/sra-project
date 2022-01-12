protected void doClose() throws java.io.IOException {
    if (!(this.connected.compareAndSet(com.moilioncircle.redis.replicator.Status.CONNECTED, com.moilioncircle.redis.replicator.Status.DISCONNECTING)))
        return ;
    
    try {
        if ((inputStream) != null) {
            this.inputStream.setRawByteListeners(null);
            inputStream.close();
        }
    } catch (java.io.IOException ignore) {
    } finally {
        this.connected.set(com.moilioncircle.redis.replicator.Status.DISCONNECTED);
    }
    doCloseListener(this);
}