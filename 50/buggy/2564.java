@java.lang.Override
public boolean isActive() {
    java.util.concurrent.locks.Lock l = this.hashlock.readLock();
    l.lock();
    try {
        return this.active;
    } finally {
        l.unlock();
    }
}