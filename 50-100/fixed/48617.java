public java.util.Map<java.lang.String, java.lang.Object> cityDataAsMap() {
    java.util.Map<java.lang.String, java.lang.Object> cityPrefs = cityPrefCache.entries(cityPrefCacheKey());
    if (cityPrefs.isEmpty()) {
        cityPrefCache.putAll(cityPrefCacheKey(), getCityByURL(org.egov.infra.config.core.ApplicationThreadLocals.getDomainName()).toMap());
        cityPrefs = cityPrefCache.entries(cityPrefCacheKey());
    }
    return cityPrefs;
}