public int search(T item) {
    nodes.ListNode<T> nodeCurrent = head;
    if (nodeCurrent.getItem().equals(item))
        return nodeCurrent.getItemCount();
    
    while ((nodeCurrent.getNext()) != null) {
        nodeCurrent = nodeCurrent.getNext();
        if (nodeCurrent.getItem().equals(item))
            return nodeCurrent.getItemCount();
        
    } 
    return 0;
}