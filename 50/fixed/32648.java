java.lang.Object getRequestCache(java.lang.String key) {
    return (requestCache) == null ? null : requestCache.get(key);
}