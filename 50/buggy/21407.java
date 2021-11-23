@java.lang.Override
public boolean hasRangeQuerySupport() {
    com.orientechnologies.orient.core.index.OIndexAbstract.acquireSharedLock();
    try {
        return indexEngine.hasRangeQuerySupport();
    } finally {
        com.orientechnologies.orient.core.index.OIndexAbstract.releaseSharedLock();
    }
}