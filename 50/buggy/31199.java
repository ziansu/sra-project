public static java.util.Date getCurrentUTCTime() {
    java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
    java.util.TimeZone.setDefault(java.util.TimeZone.getTimeZone("UTC"));
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    java.util.TimeZone.setDefault(timeZone);
    return calendar.getTime();
}