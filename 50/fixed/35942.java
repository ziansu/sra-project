public int getInt(java.lang.String key, int defValue) {
    return getSharedPreferences().getInt(key, defValue);
}