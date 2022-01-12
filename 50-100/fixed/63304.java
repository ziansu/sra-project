private T removeNode(com.dici.collection.DoublyLinkedList.ListNode<T> node) {
    if (node == (first))
        first = node.next;
    
    if (node == (last))
        last = node.prev;
    
    if ((node.prev) != null)
        com.dici.collection.DoublyLinkedList.ListNode.biLinkNext(node.prev, node.next);
    
    (size)--;
    return node.data;
}