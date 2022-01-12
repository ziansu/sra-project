@java.lang.Override
public com.dotcms.vanityurl.model.CachedVanityUrl get(final java.lang.String key) {
    com.dotcms.vanityurl.model.CachedVanityUrl cachedVanityUrl = null;
    try {
        cachedVanityUrl = ((com.dotcms.vanityurl.model.CachedVanityUrl) (com.dotcms.cache.VanityUrlCacheImpl.cache.get(key, getPrimaryGroup())));
    } catch (com.dotmarketing.business.DotCacheException e) {
        com.dotmarketing.util.Logger.debug(this, "Cache Entry not found", e);
    }
    return cachedVanityUrl;
}