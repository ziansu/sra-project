public T poll(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
    long nanos = unit.toNanos(timeout);
    final java.util.concurrent.locks.ReentrantLock lock = this.lock;
    lock.lockInterruptibly();
    T result;
    try {
        while (((result = dequeue()) == null) && (nanos > 0))
            nanos = notEmpty.awaitNanos(nanos);
        
    } finally {
        lock.unlock();
    }
    return result;
}