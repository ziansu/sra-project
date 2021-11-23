private static void setUses(android.content.SharedPreferences prefs, int uses) {
    prefs.edit().putInt(Constants.PREF_KEY_RATING_USES, uses).commit();
}