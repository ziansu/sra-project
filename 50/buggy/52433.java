public void flush() {
    com.orientechnologies.orient.core.index.OIndexAbstract.acquireSharedLock();
    try {
        indexEngine.flush();
    } finally {
        com.orientechnologies.orient.core.index.OIndexAbstract.releaseSharedLock();
    }
}