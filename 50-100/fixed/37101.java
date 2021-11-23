void delete(int data) {
    if ((head) == null) {
        return ;
    }
    if ((head.data) == data) {
        head = head.next;
        return ;
    }
    com.agentwaj.ch02.general.LinkedList.Node n = head;
    while ((n.next) != null) {
        if ((n.next.data) == data) {
            n.next = n.next.next;
            return ;
        }
        n = n.next;
    } 
}