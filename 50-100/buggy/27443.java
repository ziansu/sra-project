public Item removeFirst() {
    if (isEmpty())
        throw new java.util.NoSuchElementException();
    
    Item oldFirstItem = first.item;
    first = first.next;
    first.preview = null;
    if ((n) == 2)
        last = first;
    
    (n)--;
    return oldFirstItem;
}