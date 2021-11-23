public static ReverseLinkedList.LinkedListNode reverseList(ReverseLinkedList.LinkedListNode front) {
    ReverseLinkedList.LinkedListNode curr = front;
    ReverseLinkedList.LinkedListNode temp;
    while ((curr != null) && ((curr.next) != null)) {
        temp = front;
        front = curr.next;
        curr.next = front.next;
        front.next = temp;
    } 
    return front;
}