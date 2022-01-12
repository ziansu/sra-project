public void storeData(android.content.Context context, java.lang.String data) {
    if ((com.aquamorph.frcmanager.Constants.TRACTING_LEVEL) > 0) {
        android.util.Log.d(TAG, "Storing Data");
    }
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    android.content.SharedPreferences.Editor editor = prefs.edit();
    editor.putString(name, data);
    editor.apply();
}