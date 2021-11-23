public Item removeLast() {
    if (isEmpty())
        throw new java.util.NoSuchElementException("Stack underflow");
    
    Item item = last.item;
    last = last.previous;
    (n)--;
    if (isEmpty()) {
        first = null;
        last = null;
    }else {
        last.next = null;
    }
    return item;
}