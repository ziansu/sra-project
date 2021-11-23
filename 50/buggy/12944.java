java.lang.String dropCache(java.lang.String cacheId, java.lang.String userId, java.nio.ByteBuffer xml) {
    try {
        geoStore.populateData(cacheId, userId, xml);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return "hello";
}