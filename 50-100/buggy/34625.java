public Item removeLast() {
    if (isEmpty())
        throw new java.util.NoSuchElementException("Stack underflow");
    
    Item item = last.item;
    last = last.previous;
    last.next = null;
    (n)--;
    if (isEmpty())
        first = null;
    
    return item;
}