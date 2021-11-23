public foo.NullableCollectionFieldsBuilder strings(java.lang.Iterable<? extends java.lang.String> strings) {
    if (strings == null) {
        this.strings = null;
        return this;
    }
    if (strings instanceof java.util.Collection) {
        return strings(((java.util.Collection<? extends java.lang.String>) (strings)));
    }
    return strings(strings.iterator());
}