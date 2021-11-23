public Item removeFirst() {
    if (isEmpty())
        throw new java.util.NoSuchElementException();
    
    Item oldFirstItem = first.item;
    first = first.next;
    (size)--;
    if (!(isEmpty())) {
        first.previous = null;
    }
    return oldFirstItem;
}