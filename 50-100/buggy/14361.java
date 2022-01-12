public T take() throws java.lang.InterruptedException {
    java.lang.Object object = null;
    final java.util.concurrent.locks.Lock lock = this.lock;
    lock.lockInterruptibly();
    try {
        while ((object = dequeue()) == null)
            empty.await();
        
    } finally {
        lock.unlock();
    }
    return ((T) (object));
}