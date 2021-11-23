@java.lang.Override
public void drain() {
    if (evictionLock.tryLock()) {
        drainUnderLock();
        evictionLock.unlock();
    }
}