public boolean isPalindrome(ListNode head) {
    if ((head == null) || ((head.next) == null)) {
        return true;
    }else {
        ListNode first = head;
        ListNode second = head;
        while ((second != null) && ((second.next) != null)) {
            first = first.next;
            second = second.next.next;
        } 
        return check(new ListNode[]{ head }, first.next);
    }
}