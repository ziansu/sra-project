public boolean awaitTermination(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.IllegalStateException, java.lang.InterruptedException {
    if (org.pnpo.db.pool.DatabaseConnectionPool.Status.TERMINATED.equals(status)) {
        return true;
    }
    if (!(org.pnpo.db.pool.DatabaseConnectionPool.Status.SHUTDOWN.equals(status))) {
        throw new java.lang.IllegalStateException();
    }
    connectionLock.lock();
    try {
        return terminatedCondition.await(timeout, unit);
    } finally {
        connectionLock.unlock();
    }
}