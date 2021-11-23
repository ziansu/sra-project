public static java.lang.String getDate(java.util.Date now) {
    java.lang.String dateFormat = "dd/MM/yyyy";
    java.lang.String timeFormat = "HH:mm:ss";
    java.text.SimpleDateFormat sdfDate = new java.text.SimpleDateFormat(dateFormat);
    java.text.SimpleDateFormat sdfTime = new java.text.SimpleDateFormat(timeFormat);
    return ((sdfDate.format(now)) + " | ") + (sdfTime.format(now));
}