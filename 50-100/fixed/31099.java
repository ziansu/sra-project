protected void setCreateError(java.lang.Throwable ex) {
    if (ex == null) {
        lock.lock();
        try {
            if ((createError) != null) {
                createError = null;
            }
        } finally {
            lock.unlock();
        }
        return ;
    }
    createErrorCount.incrementAndGet();
    long now = java.lang.System.currentTimeMillis();
    lock.lock();
    try {
        createError = ex;
        lastCreateError = ex;
        lastCreateErrorTimeMillis = now;
    } finally {
        lock.unlock();
    }
}