public T poll() {
    java.lang.Object object = null;
    final java.util.concurrent.locks.Lock lock = this.lock;
    lock.lock();
    try {
        object = dequeue();
    } finally {
        lock.unlock();
    }
    return ((T) (object));
}