public static java.lang.String formatDateUnknownTimezone(java.util.Date date) {
    java.util.Calendar calendar = java.util.GregorianCalendar.getInstance(java.util.Locale.US);
    calendar.setTime(date);
    java.lang.String formatted = org.apache.tika.utils.DateUtils.formatDate(date);
    return formatted.substring(0, ((formatted.length()) - 1));
}