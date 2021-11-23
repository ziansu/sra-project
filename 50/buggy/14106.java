public static boolean hideAds(android.content.Context context) {
    return !(android.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean(context.getString(R.string.pref_ads), false));
}