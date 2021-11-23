@java.lang.Override
public boolean add(E e) {
    boolean result = underlyingList.add(e);
    markAsStale();
    return result;
}