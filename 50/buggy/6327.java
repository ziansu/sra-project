public Item next() {
    if (!(hasNext()))
        throw new java.util.NoSuchElementException();
    
    Item item = current.item;
    current = current.next;
    return item;
}