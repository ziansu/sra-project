public java.util.List<java.lang.String> getAllExclude(boolean forceRefresh) {
    long currentTime = java.lang.System.currentTimeMillis();
    if (forceRefresh || ((respawnExclusionCacheExpires) <= currentTime)) {
        respawnExclusionCacheExpires = currentTime + (SPAWN_EXCLUSION_TIMEOUT);
        respawnExclusionCache = retrieveAllExcludeFromDb();
        respawnExclusionCacheImmutable = java.util.Collections.unmodifiableList(respawnExclusionCache);
    }
    return respawnExclusionCacheImmutable;
}