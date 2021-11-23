private java.lang.String[] map2Array(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
    if (map == null) {
        return null;
    }
    java.util.List<java.lang.String> values = new java.util.ArrayList<java.lang.String>();
    for (java.util.List<java.lang.String> entry : map.values()) {
        if (entry != null) {
            values.addAll(entry);
        }
    }
    return values.toArray(new java.lang.String[values.size()]);
}