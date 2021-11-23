public java.util.Map<java.lang.String, java.lang.Object> cityDataAsMap() {
    java.util.Map<java.lang.String, java.lang.Object> cityPrefs = cityPrefCache.entries(cityPrefCacheKey());
    if (cityPrefs.isEmpty()) {
        java.lang.System.out.println(("ApplicationThreadLocals.getDomainName()>>>>>>>>>" + (org.egov.infra.config.core.ApplicationThreadLocals.getDomainName())));
        cityPrefCache.putAll(cityPrefCacheKey(), getCityByURL(org.egov.infra.config.core.ApplicationThreadLocals.getDomainName()).toMap());
        cityPrefs = cityPrefCache.entries(cityPrefCacheKey());
    }
    return cityPrefs;
}