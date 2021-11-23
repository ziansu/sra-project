public long getValueAsLong(java.lang.String key) {
    java.lang.String stringValue = getValue(key);
    return java.lang.Long.parseLong(stringValue);
}