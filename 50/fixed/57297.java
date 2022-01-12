public foo.NullableCollectionFieldsBuilder putInteger(java.lang.String key, java.lang.Integer value) {
    if ((this.integers) == null) {
        this.integers = new java.util.HashMap<java.lang.String, java.lang.Integer>();
    }
    integers.put(key, value);
    return this;
}