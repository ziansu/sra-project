private void sendDataSequentially(java.nio.ByteBuffer data) throws java.io.IOException, java.lang.InterruptedException {
    if (((connectionInfoForReconnect_.isBlockForReconnect()) == false) && (writeLock_.tryAcquire(net.named_data.jndn.transport.AsyncTcpTransport.DEFAULT_LOCK_TIMEOUT_MS, java.util.concurrent.TimeUnit.MILLISECONDS))) {
        channel_.write(data, data, writeCompletionHandler_);
    }else {
        throw new java.io.IOException("Failed to acquire lock on channel to write buffer");
    }
}