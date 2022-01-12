@java.lang.Override
public void removeCachedVanityUrls(java.lang.String key) {
    try {
        com.dotcms.cache.VanityUrlCacheImpl.cache.remove(key, getCachedVanityUrlGroup());
    } catch (java.lang.Exception e) {
        com.dotmarketing.util.Logger.debug(this, "Cache not able to be removed", e);
    }
}