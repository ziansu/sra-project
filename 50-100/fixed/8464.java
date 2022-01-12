@java.lang.Override
public T get(int index) {
    if ((size()) <= index)
        throw new java.util.NoSuchElementException("The required index isn't in the list");
    
    lists.linkedlist.ListNode<T> current = firstNode;
    while (index > 0) {
        current = current.getNext();
        index--;
    } 
    return current.getData();
}