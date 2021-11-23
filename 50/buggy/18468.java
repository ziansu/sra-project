private java.lang.String getReadableDateString(long time) {
    java.text.SimpleDateFormat shortenedDateFormat = new java.text.SimpleDateFormat("EEE MMM dd");
    return shortenedDateFormat.format(time);
}