public foo.NullableCollectionFieldsBuilder strings(java.lang.Iterable<? extends java.lang.String> strings) {
    if (strings == null) {
        this.strings = null;
        return this;
    }
    if (strings instanceof foo.Collection) {
        return strings(((foo.Collection<? extends java.lang.String>) (strings)));
    }
    return strings(strings.iterator());
}