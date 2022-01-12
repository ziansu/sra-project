private java.util.Map<java.lang.String, java.lang.String> toMap(java.lang.String[] header, java.lang.String[] values) {
    java.util.Map<java.lang.String, java.lang.String> map = new java.util.LinkedHashMap<>();
    for (int i = 0; i < (header.length); i++) {
        if (i >= (values.length)) {
            break;
        }
        map.put(header[i], values[i]);
    }
    return map;
}