private static ListNode getLastNode(ListNode head) {
    Lists.Exception(head, "getLastNode");
    if ((head.next) == null) {
        return head;
    }else {
        ListNode last = new ListNode();
        while ((head.next) != null) {
            java.lang.System.out.println(("PRINT: " + (head.element)));
            last = head;
            head = head.next;
        } 
        java.lang.System.out.println(("RETUR: " + (last.element)));
        return last;
    }
}