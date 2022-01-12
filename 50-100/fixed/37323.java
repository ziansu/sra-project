private java.lang.String extractAndRemoveValuesFromMap(java.lang.String key, java.util.Map<java.lang.String, java.lang.String> map, final java.lang.String defaultValue) {
    java.lang.String value = map.get(key.toLowerCase(java.util.Locale.ENGLISH));
    if (value == null) {
        return defaultValue;
    }else {
        map.remove(key.toLowerCase(java.util.Locale.ENGLISH));
        return value;
    }
}