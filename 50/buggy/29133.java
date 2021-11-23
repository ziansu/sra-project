public void putBoolean(java.lang.String key, boolean value) {
    checkForNullKey(key);
    preferences.edit().putBoolean(key, value).apply();
}