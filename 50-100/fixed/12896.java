public static java.lang.String format(final int year, final int month, final int day, final java.lang.String pattern) {
    final java.util.Calendar cal = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
    cal.set(java.util.Calendar.YEAR, year);
    cal.set(java.util.Calendar.MONTH, (month - 1));
    cal.set(java.util.Calendar.DAY_OF_MONTH, day);
    return new java.text.SimpleDateFormat(pattern).format(cal.getTime());
}