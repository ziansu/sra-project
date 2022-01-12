public static java.lang.Integer pref_behaviour_comment_min(final android.content.Context context, final android.content.SharedPreferences sharedPreferences) {
    java.lang.Integer defaultValue = -4;
    final java.lang.String value = org.quantumbadger.redreader.common.PrefsUtility.getString(R.string.pref_behaviour_comment_min_key, defaultValue.toString(), context, sharedPreferences);
    if ((value == null) || (value.trim().isEmpty())) {
        return null;
    }
    try {
        return java.lang.Integer.parseInt(value);
    } catch (java.lang.Throwable _) {
        return defaultValue;
    }
}