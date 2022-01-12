private java.lang.String getCurrentTimezoneOffsetInMinutes() {
    java.util.TimeZone tz = java.util.TimeZone.getDefault();
    java.util.Calendar cal = java.util.GregorianCalendar.getInstance(tz);
    int offsetInMillis = tz.getOffset(cal.getTimeInMillis());
    java.lang.String offset = java.lang.String.format("%d", (offsetInMillis / (1000 * 60)));
    return offset;
}