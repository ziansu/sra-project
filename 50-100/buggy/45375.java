@java.lang.Override
public boolean contains(T t) {
    if (((first) == null) || (t == null)) {
        return false;
    }
    dsaaj.c3.MyLinkedList.Node<T> next = first;
    while (next != null) {
        if (t.equals(next.item)) {
            return true;
        }
        next = next.next;
    } 
    return false;
}