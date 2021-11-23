public T take() throws java.lang.InterruptedException {
    final java.util.concurrent.locks.ReentrantLock lock = this.lock;
    lock.lockInterruptibly();
    T result;
    try {
        while ((result = dequeue()) == null)
            notEmpty.await();
        
    } finally {
        lock.unlock();
    }
    return result;
}