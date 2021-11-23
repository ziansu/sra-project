@java.lang.Override
public java.lang.Object get(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
    if ((result) != null) {
        return result;
    }
    long timeoutNs = unit.toNanos(timeout);
    lock.lock();
    try {
        while ((result) == null) {
            if (timeout <= 0) {
                throw new java.util.concurrent.TimeoutException();
            }
            timeoutNs = condition.awaitNanos(timeoutNs);
        } 
        return result;
    } finally {
        lock.unlock();
    }
}