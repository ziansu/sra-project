public void SetPreferenceValue(java.lang.String key, java.lang.String value) {
    preferences.edit().putString(key, value).apply();
}