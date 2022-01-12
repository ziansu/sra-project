public Item removeFirst() {
    if ((size()) == 0)
        throw new java.util.NoSuchElementException("remove from a null deque!");
    
    if ((size()) == ((stored.length) / 4))
        resize(((stored.length) / 2));
    
    Item item = stored[first];
    stored[first] = null;
    first = ((first) + 1) % (stored.length);
    return item;
}