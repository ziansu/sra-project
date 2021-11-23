public long write(tlschannel.impl.ByteBufferSet source) throws java.io.IOException {
    handshake();
    writeLock.lock();
    try {
        if ((invalid) || (shutdownSent)) {
            throw new java.nio.channels.ClosedChannelException();
        }
        return wrapAndWrite(source);
    } finally {
        writeLock.unlock();
    }
}