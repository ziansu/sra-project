public static boolean isFirstRun(android.content.Context context) {
    android.content.SharedPreferences sharedPreferences = ((Build.VERSION.SDK_INT) > 19) ? android.preference.PreferenceManager.getDefaultSharedPreferences(context) : context.getSharedPreferences("general_settings", Context.MODE_PRIVATE);
    return sharedPreferences.getBoolean(tz.co.wadau.calenderapp.InitialSettingsActivity.IS_FIRST_RUN, true);
}