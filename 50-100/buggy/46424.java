@java.lang.Override
public void deleteFile(long fileId, com.orientechnologies.orient.core.storage.cache.local.OWriteCache writeCache) throws java.io.IOException {
    fileId = com.orientechnologies.orient.core.storage.cache.local.OAbstractWriteCache.checkFileIdCompatibility(fileId, writeCache.getId());
    java.util.concurrent.locks.Lock fileLock;
    cacheLock.acquireReadLock();
    try {
        fileLock = fileLockManager.acquireExclusiveLock(fileId);
        try {
            truncateFile(fileId, writeCache);
            filePages.remove(fileId);
            writeCache.deleteFile(fileId);
        } finally {
            fileLockManager.releaseLock(fileLock);
        }
    } finally {
        cacheLock.releaseReadLock();
    }
}