@java.lang.Override
protected void onPause() {
    super.onPause();
    com.example.black.pmk.data.ProgressStore progressStore = new com.example.black.pmk.data.ProgressStore(store.getProgressStore());
    android.content.SharedPreferences.Editor prefsEditor = mPrefs.edit();
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String json = gson.toJson(progressStore);
    prefsEditor.putString("progressStore", json);
    prefsEditor.apply();
}