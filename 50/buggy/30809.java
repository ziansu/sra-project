private double getDoubleFromLongFromPrefs(java.lang.String key) {
    return java.lang.Double.longBitsToDouble(sharedPreferences.getLong(key, 0));
}