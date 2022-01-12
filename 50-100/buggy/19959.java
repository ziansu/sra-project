public static java.lang.Integer pref_behaviour_comment_min(final android.content.Context context, final android.content.SharedPreferences sharedPreferences) {
    java.lang.Integer defaultValue = -4;
    try {
        return java.lang.Integer.parseInt(org.quantumbadger.redreader.common.PrefsUtility.getString(R.string.pref_behaviour_comment_min_key, defaultValue.toString(), context, sharedPreferences));
    } catch (java.lang.Throwable _) {
        return defaultValue;
    }
}