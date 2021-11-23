private org.wso2.carbon.appmgt.api.model.AuthenticatedIDP[] getCachedAuthenticatedIDP(java.lang.String key) {
    javax.cache.Cache cache = javax.cache.Caching.getCacheManager(AppMConstants.AUTHENTICATED_IDP_CACHE_MANAGER).getCache(AppMConstants.AUTHENTICATED_IDP_CACHE);
    java.lang.Object cachedObject = cache.get(key);
    if ((cachedObject != null) && (cachedObject instanceof org.wso2.carbon.appmgt.api.model.AuthenticatedIDP[])) {
        return ((org.wso2.carbon.appmgt.api.model.AuthenticatedIDP[]) (cachedObject));
    }else {
        return null;
    }
}