public static void main(java.lang.String[] args) {
    com.prabhash.java.interview.ch2.LinkedListImpl ll = new com.prabhash.java.interview.ch2.LinkedListImpl();
    ll.generateLinkedList();
    com.prabhash.java.interview.ch2.LinkedListImpl.Node head = ll.getHead();
    ll.prettyPrintLinkedList(head);
    int data = com.prabhash.java.interview.ch2.FindNthToLastNode.findKthToLast(head, 2);
    java.lang.System.out.println(("\n\nKth element from last: " + data));
}