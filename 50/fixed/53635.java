public static java.lang.String getAccessTokenPref(android.content.Context context) {
    android.content.SharedPreferences sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    java.lang.String accessToken = sharedPreferences.getString(context.getString(R.string.access_token_pref_key), null);
    return accessToken;
}