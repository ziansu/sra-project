public foo.NullableCollectionFieldsBuilder strings(foo.Iterator<? extends java.lang.String> strings) {
    if (strings == null) {
        this.strings = null;
        return this;
    }
    this.strings = new java.util.ArrayList<java.lang.String>();
    while (strings.hasNext()) {
        java.lang.String item = strings.next();
        this.strings.add(item);
    } 
    return this;
}