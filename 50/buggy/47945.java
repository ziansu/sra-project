public boolean contains(java.lang.Object key) {
    checkForRebuild();
    key = getCollatingValue(key);
    com.orientechnologies.orient.core.index.OIndexAbstract.acquireSharedLock();
    try {
        return indexEngine.contains(key);
    } finally {
        com.orientechnologies.orient.core.index.OIndexAbstract.releaseSharedLock();
    }
}