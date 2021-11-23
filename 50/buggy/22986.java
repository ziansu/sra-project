@java.lang.Override
public void inActive() {
    java.util.concurrent.locks.Lock l = this.hashlock.writeLock();
    l.lock();
    this.active = false;
    l.unlock();
}