public java.lang.String getFormattedEventDateOnly(java.lang.String onebrickDate) {
    try {
        final java.util.Date d = getLocalTime(org.onebrick.android.helpers.DateTimeFormatter.dateFormat.parse(onebrickDate));
        final java.lang.String date = org.onebrick.android.helpers.DateTimeFormatter.eventDate.format(d);
        return date;
    } catch (java.text.ParseException e) {
        android.util.Log.e(org.onebrick.android.helpers.DateTimeFormatter.TAG, ("cannot parse date: " + onebrickDate));
    }
    return "";
}