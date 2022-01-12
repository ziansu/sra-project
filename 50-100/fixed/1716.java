public foo.CollectionFieldsBuilder strings(java.util.Iterator<? extends java.lang.String> strings) {
    if (strings == null) {
        throw new java.lang.NullPointerException("strings");
    }
    this.strings = new java.util.ArrayList<java.lang.String>();
    while (strings.hasNext()) {
        java.lang.String item = strings.next();
        if (item == null) {
            throw new java.lang.NullPointerException("strings: null item");
        }
        this.strings.add(item);
    } 
    return this;
}