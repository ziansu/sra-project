@java.lang.Override
public void truncateFile(long fileId, com.orientechnologies.orient.core.storage.cache.local.OWriteCache writeCache) throws java.io.IOException {
    java.util.concurrent.locks.Lock fileLock;
    fileId = com.orientechnologies.orient.core.storage.cache.local.OAbstractWriteCache.checkFileIdCompatibility(writeCache.getId(), fileId);
    cacheLock.acquireReadLock();
    try {
        fileLock = fileLockManager.acquireExclusiveLock(fileId);
        try {
            writeCache.truncateFile(fileId);
            clearFile(fileId);
        } finally {
            fileLockManager.releaseLock(fileLock);
        }
    } finally {
        cacheLock.releaseReadLock();
    }
}