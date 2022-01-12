private void sendDataSequentially(java.nio.ByteBuffer data) throws java.io.IOException, java.lang.InterruptedException {
    if ((connectionInfoForReconnect_.isBlockForReconnect()) == false) {
        if ((writeLock_.tryAcquire(net.named_data.jndn.transport.AsyncTcpTransport.DEFAULT_LOCK_TIMEOUT_MS, java.util.concurrent.TimeUnit.MILLISECONDS)) == false) {
            throw new java.io.IOException("Failed to acquire lock on channel to write buffer");
        }
    }
    channel_.write(data, data, writeCompletionHandler_);
}