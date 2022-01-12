public java.lang.String format(org.joda.time.DateTime dateTime) {
    if (dateTime == null) {
        return "";
    }
    org.joda.time.DateTimeZone timeZone = dateTime.getZone();
    long utcTime = timeZone.convertLocalToUTC(dateTime.getMillis(), false);
    dateTime = new org.joda.time.DateTime((utcTime + (offset)));
    return formatter.withLocale(locale).print(dateTime);
}