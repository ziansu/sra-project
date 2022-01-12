public java.lang.String getFormattedEventEndTime(java.lang.String onebrickDate) {
    try {
        final java.util.Date d = org.onebrick.android.helpers.DateTimeFormatter.dateFormat.parse(onebrickDate);
        final java.lang.String time = org.onebrick.android.helpers.DateTimeFormatter.eventTime.format(d);
        return time;
    } catch (java.text.ParseException e) {
        android.util.Log.e(org.onebrick.android.helpers.DateTimeFormatter.TAG, ("cannot parse date: " + onebrickDate));
    }
    return "";
}