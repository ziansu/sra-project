public java.lang.String getFormattedTime() {
    java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("h:mm a");
    formatter.setTimeZone(java.util.TimeZone.getTimeZone(getTimeZone()));
    java.util.Date dateTime = new java.util.Date(((getTime()) * 1000));
    java.lang.String timeString = formatter.format(dateTime);
    return timeString;
}