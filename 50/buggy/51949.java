@java.lang.Override
public boolean remove(java.lang.Object key) {
    acquireSharedLock();
    try {
        return (sbTree.remove(key)) != null;
    } finally {
        releaseSharedLock();
    }
}