public foo.NullableCollectionFieldsBuilder strings(java.lang.String... strings) {
    if (strings == null) {
        this.strings = null;
        return this;
    }
    return strings(java.util.Arrays.asList(strings));
}