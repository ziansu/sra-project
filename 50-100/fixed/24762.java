private java.lang.String timestamp() {
    java.lang.String timestamp = null;
    java.util.Calendar cal = java.util.Calendar.getInstance();
    java.text.DateFormat dfm = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    dfm.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
    timestamp = dfm.format(cal.getTime());
    return timestamp;
}