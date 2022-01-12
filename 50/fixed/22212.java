public java.util.Iterator<T> iterator() {
    return new org.jruby.compiler.ir.util.DataIterator<T>(edges, type, source, negate);
}