public com.orientechnologies.orient.core.record.impl.ODocument getConfiguration() {
    acquireSharedLock();
    try {
        return configuration;
    } finally {
        releaseSharedLock();
    }
}