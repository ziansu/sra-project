@java.lang.Override
public boolean offerFirst(T t) {
    return (ensureHasCpacity(1)) && (buffer.offerFirst(t));
}