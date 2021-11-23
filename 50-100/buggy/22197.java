@java.lang.Override
public boolean contains(E e) {
    if ((size) == 0) {
        return false;
    }
    cc.cc1234.datastructure.list.imp.LinkedList.Node<E> n = head;
    while (n != null) {
        if ((n.value.compareTo(e)) == 1) {
            return true;
        }
        n = n.next;
    } 
    return false;
}