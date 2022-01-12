@java.lang.Override
public void removeLast() {
    com.filbin.Enumerables.Linked.Single.Node<T> current = head;
    com.filbin.Enumerables.Linked.Single.Node<T> previous = null;
    while (current != null) {
        previous = current;
        current = current.next;
    } 
    previous.next = null;
    (this.size)--;
}