public static java.lang.String getProperty(java.lang.String key) {
    java.lang.Object value = com.dubboclub.cache.config.CacheConfig.properties.get(key);
    if (value == null) {
        return null;
    }else {
        return value.toString();
    }
}