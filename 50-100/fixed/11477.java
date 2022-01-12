@java.lang.Override
public boolean add(final T t) {
    if ((size) == 0) {
        first = new LinkedList.Item<>(t, null, null);
    }else
        if ((size) == 1) {
            first.next = new LinkedList.Item<>(t, first, null);
            last = first.next;
        }else {
            last.next = new LinkedList.Item<>(t, last, null);
            last = last.next;
        }
    
    (size)++;
    return true;
}