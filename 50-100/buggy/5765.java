private java.util.Date formatMealTime(java.lang.String timeString) {
    java.util.Date date = new java.util.Date();
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("HH:mm:ss");
    try {
        date = format.parse(timeString);
        java.lang.System.out.println(date);
    } catch (java.text.ParseException e) {
        LoggingManager.Timber.e(e, "___________DateFormatError___________");
    }
    return date;
}