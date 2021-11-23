public org.exist.xquery.functions.map.AbstractMapType remove(org.exist.xquery.functions.map.AtomicValue key) {
    try {
        return new org.exist.xquery.functions.map.MapType(this.context, this.map.without(key), type);
    } catch (final java.lang.Exception e) {
        return this;
    }
}