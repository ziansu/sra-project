public java.util.Date getDatetime() {
    java.lang.String dateField = getTag("Date Created");
    java.lang.String timeField = getTag("Time Created");
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMdd hhmmss+SSSSSS");
    java.util.Date date = null;
    try {
        date = sdf.parse(((dateField + " ") + timeField));
    } catch (java.text.ParseException e) {
        return null;
    }
    return date;
}