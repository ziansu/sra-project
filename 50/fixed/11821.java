public java.lang.Long peekDelta(java.lang.String name, long count) {
    java.lang.Long previous = lookup.get(name);
    return calculateDelta(name, previous, count);
}