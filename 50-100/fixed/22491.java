public static java.lang.String getDate(long milliSeconds, java.lang.String dateFormat) {
    java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(dateFormat, java.util.Locale.getDefault());
    formatter.setTimeZone(java.util.TimeZone.getDefault());
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.setTimeInMillis(milliSeconds);
    return formatter.format(calendar.getTime());
}