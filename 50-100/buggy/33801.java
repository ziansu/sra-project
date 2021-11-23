final com.microsoft.sqlserver.jdbc.SQLServerConnection.PreparedStatementHandle getOrRegisterCachedPreparedStatementHandle(com.microsoft.sqlserver.jdbc.SQLServerConnection.Sha1HashKey key) {
    if (!(isStatementPoolingEnabled()))
        return null;
    
    com.microsoft.sqlserver.jdbc.SQLServerConnection.PreparedStatementHandle cacheItem = preparedStatementHandleCache.get(key);
    if (null == cacheItem) {
        cacheItem = new com.microsoft.sqlserver.jdbc.SQLServerConnection.PreparedStatementHandle();
        preparedStatementHandleCache.putIfAbsent(key, cacheItem);
    }
    return cacheItem;
}