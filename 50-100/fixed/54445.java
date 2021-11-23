private static ListNode getLastNode(ListNode head) {
    Lists.Exception(head, "getLastNode");
    if ((head.next) == null) {
        return head;
    }else {
        ListNode last = new ListNode();
        while ((head.next) != null) {
            last = head;
            head = head.next;
        } 
        java.lang.System.out.println(("RETUR: " + (last.element)));
        return last;
    }
}