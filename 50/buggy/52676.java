@java.lang.Override
public void setCachedVanityUrls(final java.lang.String key, final java.util.Set<com.dotcms.vanityurl.model.CachedVanityUrl> cachedVanityUrlList) {
    com.dotcms.cache.VanityUrlCacheImpl.cache.put(((getCachedVanityUrlGroup()) + key), cachedVanityUrlList, getCachedVanityUrlGroup());
}