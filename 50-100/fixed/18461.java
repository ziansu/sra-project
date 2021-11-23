@java.lang.SuppressWarnings(value = "Duplicates")
public void remove(com.eagulyi.interview.datastructures.MyLinkedList<T>.Node node) {
    if (node == (lastNode)) {
        removeLast();
        return ;
    }
    if (node == (firstNode)) {
        removeFirst();
        return ;
    }
    if ((node.previous) != null)
        node.previous.next = node.next;
    
    if ((node.next) != null)
        node.next.previous = node.previous;
    
    (size)--;
}