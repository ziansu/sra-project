private org.wso2.carbon.identity.oauth.cache.CacheEntry isEntryInCache(java.lang.String tokenKey) {
    org.wso2.carbon.identity.oauth.cache.OAuthCache oauthCache = org.wso2.carbon.identity.oauth.cache.OAuthCache.getInstance();
    org.wso2.carbon.identity.oauth.cache.OAuthCacheKey cacheKey = new org.wso2.carbon.identity.oauth.cache.OAuthCacheKey(tokenKey);
    return oauthCache.getValueFromCache(cacheKey);
}