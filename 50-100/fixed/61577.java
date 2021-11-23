private java.util.Map<java.lang.String, java.lang.String> getMetaData(com.splunk.splunkjenkins.SplunkJenkinsInstallation config) {
    com.splunk.splunkjenkins.utils.LogEventHelper.UrlQueryBuilder metaDataBuilder = new com.splunk.splunkjenkins.utils.LogEventHelper.UrlQueryBuilder();
    metaDataBuilder.putIfAbsent("source", source);
    for (java.lang.String metaKeyName : com.splunk.splunkjenkins.utils.EventRecord.METADATA_KEYS) {
        metaDataBuilder.putIfAbsent(metaKeyName, config.getMetaData((((eventType.name().toLowerCase()) + ".") + metaKeyName)));
        metaDataBuilder.putIfAbsent(metaKeyName, config.getMetaData(metaKeyName));
    }
    return metaDataBuilder.getQueryMap();
}