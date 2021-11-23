public static java.lang.String getConfig(java.lang.String key) {
    java.lang.Object res;
    if (((org.roda.rodain.core.AppProperties.ext_config) != null) && (org.roda.rodain.core.AppProperties.ext_config.containsKey(key))) {
        res = org.roda.rodain.core.AppProperties.ext_config.getProperty(key);
    }else {
        res = org.roda.rodain.core.AppProperties.config.getProperty(key);
    }
    if (res instanceof java.lang.String) {
        return ((java.lang.String) (res));
    }
    return java.lang.String.join(",", org.roda.rodain.core.AppProperties.config.getStringArray(key));
}