private java.lang.String formatDate(java.lang.String dateString) {
    java.util.Date date = new java.util.Date();
    java.text.SimpleDateFormat formatedDate = new java.text.SimpleDateFormat("EEEE, LLL dd");
    java.text.SimpleDateFormat originalDate = new java.text.SimpleDateFormat("yyyy-MM-dd");
    try {
        date = originalDate.parse(dateString);
    } catch (java.text.ParseException e) {
        LoggingManager.Timber.e(e, "___________DateFormatError___________");
    }
    java.lang.String formattedString = formatedDate.format(date);
    return formattedString;
}