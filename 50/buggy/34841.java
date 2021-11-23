public com.orientechnologies.orient.core.id.ORID getIdentity() {
    com.orientechnologies.orient.core.index.OIndexAbstract.acquireSharedLock();
    try {
        return indexEngine.getIdentity();
    } finally {
        com.orientechnologies.orient.core.index.OIndexAbstract.releaseSharedLock();
    }
}