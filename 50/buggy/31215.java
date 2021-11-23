public void putDouble(java.lang.String key, double value) {
    checkForNullKey(key);
    putString(key, java.lang.String.valueOf(value));
}