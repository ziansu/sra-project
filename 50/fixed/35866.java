public static long getVisitorCount(java.math.BigInteger id) {
    java.lang.Long visitorCount = com.jfinal.plugin.ehcache.CacheKit.get(io.jpress.front.controller.VisitorCounter.CACHE_NAME, ((io.jpress.front.controller.VisitorCounter.CID) + id));
    return visitorCount == null ? 0 : visitorCount;
}