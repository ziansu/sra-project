@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    android.content.Intent updateChanges = new android.content.Intent(com.kchen52.twona.SettingsActivity.SETTINGS_CHANGED);
    sendBroadcast(updateChanges);
}