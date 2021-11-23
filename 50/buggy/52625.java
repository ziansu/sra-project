public java.lang.String getString(java.lang.String key, java.lang.String defValue) {
    java.lang.String value = getSharedPreferences().getString(key, defValue);
    return value;
}