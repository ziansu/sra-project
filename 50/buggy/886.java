@java.lang.Override
public long drained() {
    evictionLock.lock();
    drainUnderLock();
    evictionLock.unlock();
    return readCounter.get();
}