public java.lang.String getString(java.lang.String key, java.lang.String defValue) {
    return getSharedPreferences().getString(key, defValue);
}