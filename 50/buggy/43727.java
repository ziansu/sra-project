public static boolean externalBrowserEnabled(android.content.Context context) {
    return android.support.v7.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean(context.getString(R.string.pref_custom_tab), false);
}