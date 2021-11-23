public long write(tlschannel.impl.ByteBufferSet source) throws java.io.IOException {
    long bytesToConsume = source.remaining();
    if (bytesToConsume == 0)
        return 0;
    
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