@java.lang.Override
public boolean add(E e) {
    markAsStale();
    return underlyingList.add(e);
}