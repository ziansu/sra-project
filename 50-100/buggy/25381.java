private void write(byte[] b, int _offset, int _len) throws java.io.IOException {
    while (!(closed.get())) {
        try {
            randomAccessFile.write(b, _offset, _len);
            size.addAndGet(_len);
            break;
        } catch (java.nio.channels.ClosedChannelException e) {
            if (java.lang.Thread.currentThread().isInterrupted()) {
                throw new java.io.InterruptedIOException();
            }
            ensureOpen();
        }
    } 
}