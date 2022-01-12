@java.lang.Override
public java.lang.Void call() throws java.lang.Exception {
    com.orientechnologies.orient.core.storage.impl.local.paginated.wal.OLogSequenceNumber minDirtyLSN = getEarliestDirtyLSN();
    java.util.Map.Entry<com.orientechnologies.orient.core.storage.impl.local.paginated.wal.OLogSequenceNumber, com.orientechnologies.orient.core.storage.cache.local.OWOWCache.PageKey> firstEntry;
    while ((minDirtyLSN != null) && ((minDirtyLSN.getSegment()) < (segmentId))) {
        flushWriteCacheFromMinLSN(1);
        firstEntry = pagesByLSN.firstEntry();
        if (firstEntry != null)
            minDirtyLSN = firstEntry.getKey();
        else
            minDirtyLSN = null;
        
    } 
    return null;
}