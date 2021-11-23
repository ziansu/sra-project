final com.microsoft.sqlserver.jdbc.SQLServerConnection.PreparedStatementCacheItem cachePreparedStatementHandle(com.microsoft.sqlserver.jdbc.SQLServerPreparedStatement.Sha1HashKey key, int handle, boolean directSql, com.microsoft.sqlserver.jdbc.SQLServerPreparedStatement statement) {
    if (!(this.isStatementPoolingEnabled()))
        return null;
    
    com.microsoft.sqlserver.jdbc.SQLServerConnection.PreparedStatementCacheItem cacheItem = this.getCachedPreparedStatementMetadata(key);
    if (null != cacheItem) {
        cacheItem.handle = handle;
        cacheItem.handleIsDirectSql = directSql;
    }else {
        cacheItem = new com.microsoft.sqlserver.jdbc.SQLServerConnection.PreparedStatementCacheItem(handle, directSql, false, null, this);
        this.cachePreparedStatementMetadata(key, cacheItem);
    }
    return cacheItem;
}