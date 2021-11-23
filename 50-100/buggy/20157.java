public void invalidateKeys(org.wso2.carbon.apimgt.gateway.handlers.security.service.APIKeyMapping[] mappings) {
    javax.cache.Cache cache = javax.cache.Caching.getCacheManager(APIConstants.API_MANAGER_CACHE_MANAGER).getCache(APIConstants.KEY_CACHE_NAME);
    for (org.wso2.carbon.apimgt.gateway.handlers.security.service.APIKeyMapping mapping : mappings) {
        java.lang.String cacheKey = ((((mapping.getKey()) + ":") + (mapping.getContext())) + ":") + (mapping.getApiVersion());
        if (cache.containsKey(cacheKey)) {
            cache.remove(cacheKey);
        }
    }
}