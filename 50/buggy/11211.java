public java.lang.String getValue(java.lang.String key, java.lang.String defaultValue) {
    java.lang.String value = sharedPreferences.getString(key, defaultValue);
    return value;
}