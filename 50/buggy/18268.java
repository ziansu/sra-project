@java.lang.Override
public void setCachedVanityUrls(java.lang.String hostId, java.util.List<com.dotcms.vanityurl.model.CachedVanityUrl> cachedVanityUrlList) {
    cache.put(((getCachedVanityUrlGroup()) + hostId), cachedVanityUrlList, getCachedVanityUrlGroup());
}