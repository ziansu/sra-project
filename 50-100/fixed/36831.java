public static java.lang.String getCurrentDate(final android.content.Context context) {
    com.metar.android.model.SettingsModel settingsModel = com.metar.android.utils.PersistentUtils.getSettingsModel(context);
    java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
    if (settingsModel != null) {
        calendar.add(java.util.Calendar.HOUR_OF_DAY, settingsModel.getTimeOffset());
    }
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("HHmm", java.util.Locale.getDefault());
    sdf.setCalendar(calendar);
    return (sdf.format(calendar.getTime())) + "Z";
}