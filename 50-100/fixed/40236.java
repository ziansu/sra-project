@java.lang.Override
public boolean contains(T value) {
    com.einhaus.list.linked.LinkedList<T>.LinkedListNode<T> trav = head;
    while (trav != null) {
        if (((trav.value) != null) && (trav.value.equals(value))) {
            return true;
        }
        trav = trav.next;
    } 
    return false;
}