public static java.lang.String getStringFromSharedPreferences(java.lang.String basic, java.lang.String key) {
    android.content.SharedPreferences sharedPreferences = com.byteshaft.waterassist.Helpers.getPreferenceManager();
    return sharedPreferences.getString(key, "");
}