public com.orientechnologies.orient.core.id.ORID getIdentity() {
    acquireSharedLock();
    try {
        return indexEngine.getIdentity();
    } finally {
        releaseSharedLock();
    }
}