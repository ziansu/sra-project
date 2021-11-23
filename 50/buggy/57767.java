public static long readLongPreference(android.content.Context context, java.lang.String preferenceToRead) {
    android.content.SharedPreferences preferences = context.getSharedPreferences(context.getString(R.string.shared_prefs_name), Context.MODE_PRIVATE);
    long preference = preferences.getLong(preferenceToRead, java.lang.System.currentTimeMillis());
    return preference;
}