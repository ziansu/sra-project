public static boolean findMiddle(crackingthecodinginterview.linkedlist.LinkedListNode head) {
    crackingthecodinginterview.linkedlist.LinkedListNode runner = head;
    while ((runner != null) && ((runner.next) != null)) {
        runner = runner.next.next;
        if ((runner != null) && ((runner.next) != null)) {
            head = head.next;
        }else {
            head.next = head.next.next;
        }
    } 
    return false;
}