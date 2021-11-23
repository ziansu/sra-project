private java.lang.String getValueFromHash(java.util.Map map, java.lang.String key) {
    if (map.containsKey(key)) {
        return ((java.lang.String) (map.get(key)));
    }
    return "";
}