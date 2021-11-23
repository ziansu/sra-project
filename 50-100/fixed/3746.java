public Item removeLast() {
    if (isEmpty())
        throw new java.util.NoSuchElementException();
    
    Item oldLastItem = last.item;
    last = last.preview;
    if ((last) != null)
        last.next = null;
    
    if ((n) == 2)
        first = last;
    
    (n)--;
    return oldLastItem;
}