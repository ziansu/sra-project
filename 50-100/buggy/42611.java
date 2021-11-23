public java.lang.String getEndpoint(com.splunk.splunkjenkins.SplunkJenkinsInstallation config) {
    if (!(config.isMetaDataInURLSupported(eventType.needSplit()))) {
        return config.getJsonUrl();
    }
    java.util.Map queryMap = new java.util.HashMap();
    queryMap.putAll(getMetaData());
    return ((config.getRawUrl()) + "?") + (LogEventHelper.UrlQueryBuilder.toString(queryMap));
}