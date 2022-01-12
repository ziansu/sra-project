public static long applyTimezone(long localTimestamp) {
    java.util.TimeZone tz = org.isoron.uhabits.utils.DateUtils.getTimezone();
    return localTimestamp - (tz.getOffset((localTimestamp - (tz.getOffset(localTimestamp)))));
}