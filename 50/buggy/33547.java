public synchronized void close() throws java.sql.SQLException {
    super.close();
    if ((this.statementEventListeners) != null) {
        this.statementEventListeners.clear();
        this.statementEventListeners = null;
    }
}