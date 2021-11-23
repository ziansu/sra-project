public java.lang.Long getDelta(java.lang.String name, long count) {
    java.lang.Long previous = lookup.put(name, count);
    if (previous == null) {
        previous = 0L;
    }
    return calculateDelta(name, previous, count);
}