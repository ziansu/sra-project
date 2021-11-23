public void updateStorageLocation(android.content.Context ctx) {
    java.lang.String location = this.getStorageLocation(ctx);
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(ctx);
    android.content.SharedPreferences.Editor editor = prefs.edit();
    editor.putString(PrefsActivity.PREF_STORAGE_LOCATION, location);
    editor.commit();
}