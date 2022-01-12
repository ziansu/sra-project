public void removeOne(T item) {
    nodes.ListNode<T> nodeCurrent = head;
    while ((!(nodeCurrent.getItem().equals(item))) && ((nodeCurrent.getNext()) != null)) {
        nodeCurrent = nodeCurrent.getNext();
    } 
    if (nodeCurrent.getItem().equals(item)) {
        nodeCurrent.deincrementItemCount();
    }
}