@java.lang.Override
public boolean contains(T expected) {
    lists.linkedlist.ListNode<T> current = firstNode;
    while (current != null) {
        if (current.getObject().equals(expected))
            return true;
        
        current = current.getNext();
    } 
    return false;
}