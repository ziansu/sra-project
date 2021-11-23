@java.lang.Override
public void remove() {
    if ((previous) == (position))
        throw new java.lang.IllegalStateException();
    
    if ((position) == (first))
        removeFirst();
    else
        previous.next = position.next;
    
    position = previous;
}