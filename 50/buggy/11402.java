public void putString(java.lang.String key, java.lang.String value) {
    checkForNullKey(key);
    checkForNullValue(value);
    preferences.edit().putString(key, value).apply();
}