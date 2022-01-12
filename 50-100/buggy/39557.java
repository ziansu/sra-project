public org.gdg.frisbee.android.cache.ModelCache.CacheItem getFromMemoryCache(final java.lang.String url, boolean checkExpiration) {
    org.gdg.frisbee.android.cache.ModelCache.CacheItem result = null;
    if (null != (mMemoryCache)) {
        synchronized(mMemoryCache) {
            result = mMemoryCache.get(url);
            if (((null != result) && (result.getExpiresAt().isBeforeNow())) && checkExpiration) {
                mMemoryCache.remove(url);
                result = null;
            }
        }
    }
    return result;
}