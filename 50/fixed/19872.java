@java.lang.Override
public void setCachedVanityUrls(com.dotmarketing.beans.Host host, java.util.Set<com.dotcms.vanityurl.model.CachedVanityUrl> cachedVanityUrlList) {
    setCachedVanityUrls(host.getIdentifier(), cachedVanityUrlList);
}