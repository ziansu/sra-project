@android.support.annotation.NonNull
public java.lang.String getFormattedEventDateOnly(java.lang.String onebrickDate) {
    try {
        final java.util.Date d = org.onebrick.android.helpers.DateTimeFormatter.dateFormat.parse(onebrickDate);
        return org.onebrick.android.helpers.DateTimeFormatter.eventDate.format(d);
    } catch (java.text.ParseException e) {
        android.util.Log.e(org.onebrick.android.helpers.DateTimeFormatter.TAG, ("cannot parse date: " + onebrickDate));
    }
    return "";
}