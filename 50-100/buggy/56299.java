public void onEviction(com.microsoft.sqlserver.jdbc.SQLServerPreparedStatement.Sha1HashKey key, com.microsoft.sqlserver.jdbc.SQLServerConnection.PreparedStatementCacheItem cacheItem) {
    if (null != cacheItem) {
        cacheItem.evictedFromCache = true;
        if ((cacheItem.hasHandle()) && (cacheItem.discardIfHandleNotReferenced())) {
            cacheItem.connection.enqueuePreparedStatementDiscardItem(cacheItem.handle, cacheItem.handleIsDirectSql);
            cacheItem.connection.handlePreparedStatementDiscardActions(false);
        }
    }
}