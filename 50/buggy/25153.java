public static long applyTimezone(long localTimestamp) {
    java.util.TimeZone tz = org.isoron.uhabits.utils.DateUtils.getTimezone();
    long now = new java.util.Date(localTimestamp).getTime();
    return now - (tz.getOffset(now));
}