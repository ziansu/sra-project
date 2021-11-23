private java.lang.String getStreamName(java.lang.String streamName) {
    java.lang.String[] parts = streamName.split("/");
    if ((parts.length) > 1)
        return org.apache.commons.lang3.StringUtils.join(parts, '/', 1, parts.length);
    
    return "";
}