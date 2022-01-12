@java.lang.Override
public final void print(java.lang.Appendable o) throws java.io.IOException {
    o.append('[');
    if (!(isEmpty())) {
        net.sf.staccatocommons.defs.tuple.Tuple2<A, net.sf.staccatocommons.collections.stream.Stream<A>> ht = decons();
        printElement(o, ht._0());
        for (A element : ht._1()) {
            o.append(", ");
            printElement(o, element);
        }
    }
    o.append(']');
}