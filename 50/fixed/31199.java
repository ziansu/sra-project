public static java.util.Date getCurrentUTCTime() {
    java.util.TimeZone.setDefault(java.util.TimeZone.getTimeZone("UTC"));
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    return calendar.getTime();
}