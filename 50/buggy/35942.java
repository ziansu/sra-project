public int getInt(java.lang.String key, int defValue) {
    int value = getSharedPreferences().getInt(key, defValue);
    return value;
}