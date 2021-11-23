public java.lang.String get(java.lang.String key) {
    java.lang.String[] value = super.get(key);
    if (value == null) {
        return null;
    }
    if ((value.length) == 0) {
        return null;
    }else {
        return value[0];
    }
}