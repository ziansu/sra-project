public static long removeTimezone(long timestamp) {
    java.util.TimeZone tz = org.isoron.uhabits.utils.DateUtils.getTimezone();
    long now = new java.util.Date(timestamp).getTime();
    return now + (tz.getOffset(now));
}