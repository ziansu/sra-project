public void close(long timeout, java.util.concurrent.TimeUnit timeUnit) {
    if (timeout < 0)
        throw new java.lang.IllegalArgumentException("The timeout cannot be negative.");
    
    acquire();
    try {
        if (!(closed)) {
            closed = true;
            close(timeUnit.toMillis(timeout), false);
        }
    } finally {
        release();
    }
}