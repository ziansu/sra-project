@java.lang.Override
public boolean add(final T t) {
    if ((size) == 0) {
        first = new LinkedList.Item<>(t, null, null);
    }else
        if ((size) == 1) {
            last = new LinkedList.Item<>(t, first, null);
            first.next = last;
        }else {
            LinkedList.Item<T> lastInList = last;
            last.next = new LinkedList.Item<>(t, lastInList, null);
        }
    
    (size)++;
    return true;
}