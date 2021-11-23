private void saveToSharedPrefs(java.lang.String type, java.lang.String data) {
    android.util.Log.d(com.hillelevo.cityelf.Constants.TAG, ((("MainActivity savedToSharedPrefs: " + type) + ", ") + data));
    android.content.SharedPreferences.Editor editor = com.hillelevo.cityelf.activities.MainActivity.settings.edit();
    editor.putString(type, data);
    editor.apply();
}