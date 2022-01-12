@java.lang.Override
public void release(final org.exist.storage.lock.LockMode mode, final int count) {
    switch (mode) {
        case NO_LOCK :
            org.exist.storage.lock.MultiReadReentrantLock.LOG.warn((("Released with LockMode.NO_LOCK and count=" + count) + "!"));
            break;
        case READ_LOCK :
            releaseRead(count);
            break;
        case WRITE_LOCK :
            releaseWrite(count);
            break;
        default :
            throw new java.lang.IllegalStateException();
    }
}