public static void writePage(javax.servlet.http.HttpServletResponse response, int httpCode, java.lang.String message, org.geowebcache.stats.RuntimeStats runtimeStats, java.lang.String contentType) {
    org.geowebcache.io.Resource res = null;
    if (message != null) {
        res = new org.geowebcache.io.ByteArrayResource(message.getBytes());
    }
    org.geowebcache.GeoWebCacheUtils.writeFixedResponse(response, httpCode, contentType, res, CacheResult.OTHER, runtimeStats);
}