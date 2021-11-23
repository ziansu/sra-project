@java.lang.Override
public boolean addAll(java.util.Collection<? extends E> c) {
    boolean result = underlyingList.addAll(c);
    markAsStale();
    return result;
}