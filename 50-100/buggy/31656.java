public synchronized boolean isLoaded() {
    try {
        java.lang.Object obj = cache.get(com.dotcms.publisher.endpoint.business.PublishingEndPointCacheImpl.MAP_KEY, com.dotcms.publisher.endpoint.business.PublishingEndPointCacheImpl.cacheGroup);
        if (obj != null) {
            isLoaded = true;
        }
    } catch (com.dotmarketing.business.DotCacheException e) {
        com.dotmarketing.util.Logger.debug(this, "PublishingEndPoint cache not loaded yet");
        isLoaded = false;
    }
    return isLoaded;
}