public TT getWriteLock() {
    try {
        lock.lock();
        while ((writeToken) != null)
            writeReleased.awaitUninterruptibly();
        
        writeToken = new uk.ac.ebi.mg.rwarbiter.RWArbiter.ReadWriteToken();
        if ((readReqs) > 0)
            readReleased.awaitUninterruptibly();
        
        return factory.createToken();
    } finally {
        lock.unlock();
    }
}