public static boolean getZoomControlPreferences(android.content.Context ctx) {
    return android.preference.PreferenceManager.getDefaultSharedPreferences(ctx).getBoolean(Constants.PREF_SHOW_ZOOM_CONTROL, false);
}