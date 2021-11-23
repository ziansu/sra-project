public synchronized com.amiyasahu.linkedlists.singly.ListNode removeFromEnd() {
    if ((head) == null) {
        return null;
    }
    com.amiyasahu.linkedlists.singly.ListNode current = head;
    com.amiyasahu.linkedlists.singly.ListNode prev = null;
    com.amiyasahu.linkedlists.singly.ListNode next = head.getNext();
    if (next == null) {
        head = null;
        (length)--;
        return current;
    }
    while ((next = current.getNext()) != null) {
        prev = current;
        current = next;
    } 
    prev.setNext(null);
    (length)--;
    return current;
}