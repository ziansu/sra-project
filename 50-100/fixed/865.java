private synchronized void startTransaction() {
    int depth = transactionDepth.incrementAndGet();
    if (depth == 1) {
        try {
            writerConnection.setAutoCommit(false);
        } catch (java.sql.SQLException e) {
            transactionDepth.decrementAndGet();
            throw com.google.common.base.Throwables.propagate(e);
        }
    }
}