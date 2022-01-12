@java.lang.Override
public T poll(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
    long nanos = unit.toNanos(timeout);
    lock.lockInterruptibly();
    try {
        T result = dequeue();
        while ((result == null) && (nanos > 0)) {
            nanos = notEmpty.awaitNanos(nanos);
            result = dequeue();
        } 
        return result;
    } finally {
        lock.unlock();
    }
}