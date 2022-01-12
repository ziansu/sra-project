public static Node flatten(Node head) {
    if (head == null)
        return head;
    
    Node start = head;
    Node end = Node.findEnd(head);
    while (start != null) {
        if ((start.child) != null) {
            end.next = start.child;
            start.child = null;
            end = Node.findEnd(end);
        }
        start = start.next;
    } 
    return head;
}