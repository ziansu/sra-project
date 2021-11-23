public static java.lang.String getKey(java.lang.String key) {
    java.lang.String value = null;
    try {
        value = com.mmall.common.TokenCache.localCache.get(key);
        if ("null".equals(value)) {
            return null;
        }
    } catch (java.lang.Exception e) {
        com.mmall.common.TokenCache.logger.error("localCache get error", e);
    }
    return null;
}