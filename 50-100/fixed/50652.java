@java.lang.Override
public void add(T item) {
    cbeaton.SinglyLinkedList.Node end = new cbeaton.SinglyLinkedList.Node(item);
    if ((head) == null) {
        head = end;
        (length)++;
        return ;
    }
    cbeaton.SinglyLinkedList.Node n = head;
    while ((n.next) != null) {
        n = n.next;
    } 
    n.next = end;
    (length)++;
}