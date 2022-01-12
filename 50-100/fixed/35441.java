@android.annotation.SuppressLint(value = "CommitPrefEdits")
private void saveSettings() {
    android.content.SharedPreferences preferences = getPreferences();
    if (preferences != null) {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        java.lang.String json = new com.google.gson.Gson().toJson(settings);
        editor.putString(this.app_id, json);
        editor.commit();
    }
}