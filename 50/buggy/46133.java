void add(java.lang.String fieldName, boolean field, java.lang.String value, java.util.Map<java.lang.String, java.lang.Object> map) {
    if (field) {
        if (value != null) {
            map.put(fieldName, value);
        }
    }
}