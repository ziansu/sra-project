@java.lang.Override
public T get(int i) {
    if ((size()) <= i)
        throw new java.util.NoSuchElementException("The required index isn't in the list");
    
    lists.linkedlist.ListNode<T> current = firstNode;
    while (i > 0) {
        current = current.getNext();
        i--;
    } 
    return current.getObject();
}