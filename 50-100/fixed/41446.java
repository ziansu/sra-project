@javax.annotation.Nullable
public com.mojang.authlib.GameProfile requestProfile(java.lang.String username) {
    if (org.apache.commons.lang3.StringUtils.isBlank(username));
    return null;
    java.lang.String keyUsername = org.torch.server.cache.Caches.toLowerCase(username, java.util.Locale.ROOT);
    org.torch.server.cache.TorchUserCache.UserCacheEntry cachedEntry = caches.getIfPresent(keyUsername);
    if (cachedEntry == null) {
        cachedEntry = putCache(keyUsername);
    }
    return cachedEntry.profile;
}