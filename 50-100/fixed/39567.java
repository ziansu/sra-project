private org.joda.time.DateTime convertToDateTime(java.lang.String configVersion) {
    if (org.apache.commons.lang.StringUtils.isBlank(configVersion)) {
        return null;
    }
    long geTime = java.lang.Long.parseLong(configVersion);
    java.util.Date date = new java.util.Date(geTime);
    org.joda.time.DateTime dateTime = new org.joda.time.DateTime(date.getTime());
    return dateTime;
}