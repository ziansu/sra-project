public static void main(java.lang.String[] args) {
    int[] a = new int[]{ 3 , 5 };
    reverseLinkedListII.ReverseLinkedListII obj = new reverseLinkedListII.ReverseLinkedListII();
    reverseLinkedListII.ReverseLinkedListII.ListNode head = obj.makeList(a);
    reverseLinkedListII.ReverseLinkedListII.printList(head);
    head = obj.reverseBetween(head, 1, 2);
    reverseLinkedListII.ReverseLinkedListII.printList(head);
}