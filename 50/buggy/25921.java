public boolean getBoolean(java.lang.String key, boolean defValue) {
    boolean value = getSharedPreferences().getBoolean(key, defValue);
    return value;
}