public static boolean isT9Auto(android.content.Context context) {
    android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    return sp.getBoolean("t9_auto", true);
}