@java.lang.Override
public void lock() {
    java.util.concurrent.locks.Lock localLock = this.localRegistry.obtain(this.lockKey);
    localLock.lock();
    try {
        while (true) {
            try {
                while (!(this.obtainLock())) {
                    java.lang.Thread.sleep(100);
                } 
                break;
            } catch (java.lang.InterruptedException e) {
            }
        } 
    } catch (java.lang.Exception e) {
        localLock.unlock();
        rethrowAsLockException(e);
    }
}