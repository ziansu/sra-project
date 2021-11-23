public static java.lang.String getDateTimeString(@android.support.annotation.NonNull
android.content.res.Resources resources, java.util.Date date) {
    if (date == null)
        return null;
    
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat(resources.getString(R.string.format_date_time));
    return format.format(date);
}