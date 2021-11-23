public void addLast(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException("add null item!");
    
    if ((size()) == (stored.length))
        resize((2 * (stored.length)));
    
    if ((++(last)) >= (stored.length))
        last = 0;
    
    stored[last] = item;
}