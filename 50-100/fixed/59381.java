public T header(java.lang.String name, java.lang.String value) {
    java.util.Collection<java.lang.String> l = headers.getAll(name);
    if (l == null) {
        l = new java.util.ArrayList<java.lang.String>();
    }
    l = new java.util.ArrayList<>(l);
    l.add(value);
    headers.add(name, l);
    return derived.cast(this);
}