public void putFloat(java.lang.String key, float value) {
    checkForNullKey(key);
    preferences.edit().putFloat(key, value).apply();
}