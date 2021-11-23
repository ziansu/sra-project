public static void setDefaults(android.content.Context context) {
    android.preference.PreferenceManager.setDefaultValues(context, Const.APP_PREFS_NAME, Context.MODE_PRIVATE, R.xml.prefs_defaults, false);
}