@java.lang.Override
public boolean tryLock() {
    java.util.concurrent.locks.Lock localLock = this.localRegistry.obtain(this.lockKey);
    try {
        if (!(localLock.tryLock())) {
            return false;
        }
        boolean obtainedLock = this.obtainLock();
        if (!obtainedLock) {
            localLock.unlock();
        }
        return obtainedLock;
    } catch (java.lang.Exception e) {
        localLock.unlock();
        rethrowAsLockException(e);
    }
    return false;
}