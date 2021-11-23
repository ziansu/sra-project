public boolean isAutomatic() {
    com.orientechnologies.orient.core.index.OIndexAbstract.acquireSharedLock();
    try {
        return ((indexDefinition) != null) && ((indexDefinition.getClassName()) != null);
    } finally {
        com.orientechnologies.orient.core.index.OIndexAbstract.releaseSharedLock();
    }
}