public static ReverseLinkedList.LinkedListNode reverseList(ReverseLinkedList.LinkedListNode front) {
    if ((front.next) != null) {
        ReverseLinkedList.LinkedListNode curr = front;
        if ((front.next.next) == null) {
            front = front.next;
            front.next = curr;
            curr.next = null;
        }else {
            while ((curr.next.next) != null) {
                front = front.next;
                curr.next = front.next;
                front.next = curr;
            } 
            ReverseLinkedList.LinkedListNode temp = front;
            front = curr.next;
            curr.next = front.next;
            front.next = temp;
        }
    }
    return front;
}