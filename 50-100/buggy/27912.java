public static boolean findMiddle(crackingthecodinginterview.linkedlist.LinkedListNode head) {
    crackingthecodinginterview.linkedlist.LinkedListNode runner = head;
    int pointer = 0;
    while ((runner.next) != null) {
        runner = runner.next.next;
        if ((runner.next) != null) {
            head = head.next;
        }else {
            head.next = head.next.next;
        }
    } 
    return false;
}