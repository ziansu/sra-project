public Item removeFirst() {
    if ((size()) == 0)
        throw new java.util.NoSuchElementException("remove from a null deque!");
    
    Item item = stored[first];
    stored[first] = null;
    if ((++(first)) >= (stored.length))
        first = 0;
    
    if ((size()) == ((stored.length) / 4))
        resize(((stored.length) / 2));
    
    return item;
}