public TT getWriteLock() {
    try {
        lock.lock();
        while ((writeToken) != null)
            writeReleased.awaitUninterruptibly();
        
        writeToken = factory.createToken();
        if ((readReqs) > 0)
            readReleased.awaitUninterruptibly();
        
        return writeToken;
    } finally {
        lock.unlock();
    }
}