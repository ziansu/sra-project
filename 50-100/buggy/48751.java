public Item removeFirst() {
    if (isEmpty())
        throw new java.util.NoSuchElementException();
    
    Item oldFirstItem = first.item;
    first = first.next;
    if (!(isEmpty())) {
        first.previous = null;
    }
    (size)--;
    return oldFirstItem;
}