private com.janosgyerik.ojleetcode.common.ListNode removeOdd(com.janosgyerik.ojleetcode.common.ListNode head) {
    while ((head != null) && (((head.val) % 2) != 0)) {
        head = head.next;
    } 
    if (head == null) {
        return null;
    }
    com.janosgyerik.ojleetcode.common.ListNode lastEven = head;
    com.janosgyerik.ojleetcode.common.ListNode current = head.next;
    lastEven.next = null;
    while (current != null) {
        if (((current.val) % 2) == 0) {
            lastEven.next = current;
            lastEven = current;
        }
        current = current.next;
    } 
    return head;
}