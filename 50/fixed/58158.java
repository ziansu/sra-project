public void setReadOnly() {
    org.exist.storage.BrokerPool.LOG.warn("Switching database into read-only mode!");
    synchronized(readOnly) {
        readOnly = true;
    }
}