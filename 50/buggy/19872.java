@java.lang.Override
public void setCachedVanityUrls(com.dotmarketing.beans.Host host, java.util.List<com.dotcms.vanityurl.model.CachedVanityUrl> cachedVanityUrlList) {
    setCachedVanityUrls(host.getIdentifier(), cachedVanityUrlList);
}