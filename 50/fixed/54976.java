private void offerCache(org.torch.server.cache.TorchUserCache.UserCacheEntry entry) {
    if (isExpired(entry))
        return ;
    
    caches.put(entry.profile.getName().toLowerCase(java.util.Locale.ROOT), entry);
}