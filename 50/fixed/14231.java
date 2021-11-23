@java.lang.Override
public com.orientechnologies.orient.core.index.OIndexKeyCursor keyCursor() {
    checkForRebuild();
    acquireSharedLock();
    try {
        return indexEngine.keyCursor();
    } finally {
        releaseSharedLock();
    }
}