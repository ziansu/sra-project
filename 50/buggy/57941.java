@java.lang.Deprecated
public org.apache.tomcat.jdbc.pool.interceptor.StatementCache.CachedStatement isCached(java.lang.String sql) {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.concurrent.ConcurrentHashMap<org.apache.tomcat.jdbc.pool.interceptor.StatementCache.CacheKey, org.apache.tomcat.jdbc.pool.interceptor.StatementCache.CachedStatement> cache = ((java.util.concurrent.ConcurrentHashMap<org.apache.tomcat.jdbc.pool.interceptor.StatementCache.CacheKey, org.apache.tomcat.jdbc.pool.interceptor.StatementCache.CachedStatement>) (pcon.getAttributes().get(org.apache.tomcat.jdbc.pool.interceptor.StatementCache.STATEMENT_CACHE_ATTR)));
    return cache.get(sql);
}