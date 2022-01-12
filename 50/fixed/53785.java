@java.lang.Override
public java.lang.Object getFirstKey() {
    acquireSharedLock();
    try {
        return indexEngine.getFirstKey();
    } finally {
        releaseSharedLock();
    }
}