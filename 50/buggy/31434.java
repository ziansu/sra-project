private void savePreference(java.lang.String key, java.lang.String value) {
    android.content.SharedPreferences.Editor editor = pref.edit();
    editor.putString(key, value);
    editor.commit();
}