private de.clubspot.mediator.processing.caching.CacheValue retrieveFromDatabase(de.clubspot.mediator.processing.caching.CacheKey key) {
    de.clubspot.mediator.processing.caching.CacheValue value = null;
    try {
        java.sql.PreparedStatement ps = prepareStatement(de.clubspot.mediator.processing.caching.SimplePostgreCache.SELECT_VALUE_FROM_CACHE_WHERE_HASH_CODE);
        ps.setInt(1, key.hashCode());
        java.sql.ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            value = new de.clubspot.mediator.processing.caching.CompleteCacheValue(rs.getBytes("value"), key);
        }
        ps.close();
    } catch (java.sql.SQLException e) {
        throw new org.apache.cocoon.pipeline.ProcessingException(e);
    }
    return value;
}