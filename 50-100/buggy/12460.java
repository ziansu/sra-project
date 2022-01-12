public static void main(java.lang.String[] args) {
    int[] a = new int[]{ 1 , 2 , 3 , 4 , 5 };
    reverseLinkedListII.ReverseLinkedListII obj = new reverseLinkedListII.ReverseLinkedListII();
    reverseLinkedListII.ReverseLinkedListII.ListNode head = obj.makeList(a);
    reverseLinkedListII.ReverseLinkedListII.printList(head);
    head = obj.reverseBetween(head, 2, 4);
    reverseLinkedListII.ReverseLinkedListII.printList(head);
}