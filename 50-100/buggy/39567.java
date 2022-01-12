private java.lang.String convertToDateTime(java.lang.String configVersion) {
    if (org.apache.commons.lang.StringUtils.isBlank(configVersion)) {
        return controllers.auth.IPsec.IPSecStatusInfo.UNKNOWN_DATE_TIME;
    }
    long geTime = java.lang.Long.parseLong(configVersion);
    java.util.GregorianCalendar calendar = new java.util.GregorianCalendar(java.util.TimeZone.getDefault());
    calendar.setTimeInMillis(geTime);
    org.joda.time.DateTime dateTime = new org.joda.time.DateTime(geTime, org.joda.time.DateTimeZone.forTimeZone(java.util.TimeZone.getDefault()));
    org.joda.time.format.DateTimeFormatter dateTimeFormatter = org.joda.time.format.DateTimeFormat.forPattern(controllers.auth.IPsec.IPSecStatusInfo.DATE_TIME_FORMAT);
    return dateTimeFormatter.print(dateTime);
}