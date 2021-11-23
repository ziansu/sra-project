public java.lang.Object get(java.lang.String key) {
    java.lang.Object value = super.get(key);
    if (value == null) {
        return null;
    }
    if (value.getClass().isArray()) {
        int length = java.lang.reflect.Array.getLength(value);
        if (length == 0) {
            value = null;
        }else {
            value = java.lang.reflect.Array.get(value, 0);
        }
    }
    return value;
}