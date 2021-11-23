@java.lang.Override
public void closeStorage(com.orientechnologies.orient.core.storage.cache.OWriteCache writeCache) throws java.io.IOException {
    if (writeCache == null)
        return ;
    
    cacheLock.acquireWriteLock();
    try {
        final long[] filesToClear = writeCache.close();
        for (long fileId : filesToClear)
            clearFile(fileId);
        
    } finally {
        cacheLock.releaseWriteLock();
    }
}