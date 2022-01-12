protected boolean getConfigValue(java.lang.String key, boolean defaultValue) {
    if (com.cisco.oss.foundation.http.server.AbstractInfraHttpFilter.filterConfigurationDynamicRefreshEnabled) {
        return configuration.getBoolean(key, defaultValue);
    }else {
        if (!(filterConfigCache.containsKey(key))) {
            filterConfigCache.put(key, ((configuration.getBoolean(key, defaultValue)) + ""));
        }
        return java.lang.Boolean.valueOf(filterConfigCache.get(key));
    }
}