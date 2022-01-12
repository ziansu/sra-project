public T resolve(long maxWaitTime) throws java.util.concurrent.TimeoutException {
    T value = null;
    try {
        value = future.get(maxWaitTime, java.util.concurrent.TimeUnit.MILLISECONDS);
    } catch (java.util.concurrent.ExecutionException exception) {
        throw new org.kielo.smartcache.ActionResolvingException(exception.getCause());
    } catch (java.lang.InterruptedException interruptedException) {
        java.lang.Thread.currentThread().interrupt();
    } finally {
        queue.remove(key);
    }
    return value;
}