@java.lang.Override
public boolean contains(java.lang.Object key) {
    acquireSharedLock();
    try {
        return (sbTree.get(key)) != null;
    } finally {
        releaseSharedLock();
    }
}