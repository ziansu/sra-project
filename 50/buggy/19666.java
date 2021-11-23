@java.lang.Override
public boolean offerFirst(T t) {
    ensureHasCpacity(1);
    return buffer.offerFirst(t);
}