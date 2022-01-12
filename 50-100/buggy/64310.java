private void flush(boolean fsync) throws java.io.IOException {
    if (fsync) {
        while (!(closed.get())) {
            try {
                randomAccessFile.getFD().sync();
                break;
            } catch (java.nio.channels.ClosedChannelException e) {
                if (java.lang.Thread.currentThread().isInterrupted()) {
                    throw new java.io.InterruptedIOException();
                }
                ensureOpen();
            }
        } 
    }
}