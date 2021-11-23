public synchronized void endTransaction() {
    int depth = transactionDepth.decrementAndGet();
    if (depth == 0) {
        try {
            writerConnection.commit();
            writerConnection.setAutoCommit(true);
        } catch (java.sql.SQLException e) {
            throw com.google.common.base.Throwables.propagate(e);
        }
    }
}