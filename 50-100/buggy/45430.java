@java.lang.Override
public void add(int position, T item) {
    if ((head) == null) {
        head = new cbeaton.SinglyLinkedList.Node(null);
        (length)++;
    }
    int i = 0;
    cbeaton.SinglyLinkedList.Node n = head;
    while (i < position) {
        if ((n.next) == null) {
            n.next = new cbeaton.SinglyLinkedList.Node(null);
            (length)++;
        }
        n = n.next;
    } 
    n.data = item;
}