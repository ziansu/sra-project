@java.lang.Override
public int size() {
    final java.util.concurrent.locks.ReentrantLock lock = this.lock;
    lock.lock();
    try {
        return elements.size();
    } finally {
        lock.unlock();
    }
}