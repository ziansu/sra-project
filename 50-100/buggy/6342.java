public void addFirst(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException("add null item!");
    
    if ((size()) == (stored.length))
        resize((2 * (stored.length)));
    
    if ((--(first)) < 0)
        first = (stored.length) - 1;
    
    stored[first] = item;
}