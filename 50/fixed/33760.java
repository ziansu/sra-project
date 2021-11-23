private java.lang.String getCurrentTime() {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat(dateFormat, java.util.Locale.ENGLISH);
    return dateFormat.format(calendar.getTime());
}