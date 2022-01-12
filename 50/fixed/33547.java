public synchronized void close() throws java.sql.SQLException {
    super.close();
    this.statementEventListeners.clear();
}