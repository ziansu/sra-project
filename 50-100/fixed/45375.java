@java.lang.Override
public boolean contains(T t) {
    if ((first) == null) {
        return false;
    }
    dsaaj.c3.MyLinkedList.Node<T> next = first;
    while (next != null) {
        if (((t == null) && ((next.item) == null)) || ((t != null) && (t.equals(next.item)))) {
            return true;
        }
        next = next.next;
    } 
    return false;
}