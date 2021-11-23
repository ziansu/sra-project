public static com.sl.algorithms.traversal.Node reverseList(com.sl.algorithms.traversal.Node head) {
    com.sl.algorithms.traversal.Node prev;
    com.sl.algorithms.traversal.Node curr;
    com.sl.algorithms.traversal.Node next;
    prev = null;
    curr = head;
    next = null;
    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    } 
    head = prev;
    return head;
}