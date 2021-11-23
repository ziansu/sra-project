public foo.CollectionFieldsBuilder putInteger(java.lang.String key, java.lang.Integer value) {
    if (key == null) {
        throw new java.lang.NullPointerException("integer: key");
    }
    if (value == null) {
        throw new java.lang.NullPointerException("integer: value");
    }
    if ((integers) == null) {
        integers = new java.util.HashMap<java.lang.String, java.lang.Integer>();
    }
    integers.put(key, value);
    return this;
}