public void removeOne(T item) {
    nodes.ListNode<T> nodeCurrent = head;
    while (((nodeCurrent.getItem()) != item) && ((nodeCurrent.getNext()) != null)) {
        nodeCurrent = nodeCurrent.getNext();
    } 
    if ((nodeCurrent.getItem()) == item) {
        nodeCurrent.deincrementItemCount();
    }
}