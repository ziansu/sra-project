private void offerCache(org.torch.server.cache.TorchUserCache.UserCacheEntry entry) {
    if (isExpired(entry))
        return ;
    
    caches.put((org.torch.server.cache.TorchUserCache.authUUID() ? entry.profile.getName() : entry.profile.getName().toLowerCase(java.util.Locale.ROOT)), entry);
}