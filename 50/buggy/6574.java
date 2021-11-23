public java.lang.Iterable<T> getIncomingSourcesDataNotOfType(java.lang.Object type) {
    return new org.jruby.compiler.ir.util.DataIterable<T>(getIncomingEdges(), type, true);
}