@java.lang.Override
public void addFirst(T t) {
    if (ensureHasCpacity(1))
        buffer.addFirst(t);
    
}