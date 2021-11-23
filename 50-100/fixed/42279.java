public org.unix4j.arg.OptMap<E> clone() {
    final org.unix4j.arg.OptMap<E> clone = new org.unix4j.arg.OptMap<E>();
    for (final java.util.Map.Entry<org.unix4j.arg.Arg<E, ?>, org.unix4j.arg.ArgList<E, ?>> e : opts.entrySet()) {
        clone.opts.put(e.getKey(), ((e.getValue()) == null ? null : e.getValue().clone()));
    }
    return clone;
}