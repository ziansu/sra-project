public java.lang.String getValue(java.lang.String key, java.lang.String defaultValue) {
    return sharedPreferences.getString(key, defaultValue);
}