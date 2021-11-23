public boolean isAutomatic() {
    acquireSharedLock();
    try {
        return ((indexDefinition) != null) && ((indexDefinition.getClassName()) != null);
    } finally {
        releaseSharedLock();
    }
}