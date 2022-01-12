@java.lang.Override
public T take() throws java.lang.InterruptedException {
    lock.lockInterruptibly();
    try {
        T result = dequeue();
        while (result == null) {
            notEmpty.await();
            result = dequeue();
        } 
        return result;
    } finally {
        lock.unlock();
    }
}