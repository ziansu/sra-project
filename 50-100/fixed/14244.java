public void addLast(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException("add null item!");
    
    if ((size()) == (stored.length))
        resize((2 * (stored.length)));
    
    stored[last] = item;
    last = ((last) + 1) % (stored.length);
}