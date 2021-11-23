public foo.CollectionFieldsBuilder strings(java.lang.String... strings) {
    if (strings == null) {
        throw new java.lang.NullPointerException("strings");
    }
    return strings(foo.Arrays.asList(strings));
}