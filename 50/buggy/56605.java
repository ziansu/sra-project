@java.lang.Override
public java.lang.Object getLastKey() {
    acquireSharedLock();
    try {
        return sbTree.lastKey();
    } finally {
        releaseSharedLock();
    }
}