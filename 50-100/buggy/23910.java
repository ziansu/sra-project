public java.util.Map<java.lang.String, java.lang.String> getQueryParamsAsMap() {
    if (org.apache.commons.lang3.StringUtils.isEmpty(query)) {
        return java.util.Collections.emptyMap();
    }
    java.util.Map<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
    map.put(com.axibase.tsd.driver.jdbc.content.Q_PARAM_NAME, query);
    map.put(com.axibase.tsd.driver.jdbc.content.FORMAT_PARAM_NAME, com.axibase.tsd.driver.jdbc.content.FORMAT_PARAM_VALUE);
    map.put(com.axibase.tsd.driver.jdbc.content.METADATA_FORMAT_PARAM_NAME, metadataFormat);
    map.put(com.axibase.tsd.driver.jdbc.content.LIMIT_PARAM_NAME, java.lang.Long.toString(maxRowsCount));
    return map;
}