@java.lang.Override
public boolean add(T t) {
    return (ensureHasCpacity(1)) && (buffer.add(t));
}