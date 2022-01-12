@java.lang.Override
public void enqueue(E element) throws java.lang.RuntimeException {
    linkedList.ListNode listNode = new linkedList.ListNode(element, null);
    if ((size) == 0) {
        head = listNode;
    }else {
        tail.setNext(listNode);
    }
    tail = listNode;
    (size)++;
}