public T take() throws java.lang.InterruptedException {
    java.lang.Object object = null;
    final java.util.concurrent.locks.Lock lock = this.lock;
    lock.lockInterruptibly();
    try {
        while ((count) <= 0)
            empty.await();
        
        object = dequeue();
    } finally {
        lock.unlock();
    }
    return ((T) (object));
}