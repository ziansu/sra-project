public void addFirst(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException("Attempt to add null Item.");
    }
    Deque<Item>.Node oldfirst = first;
    Deque<Item>.Node newfirst = new Node();
    newfirst.item = item;
    newfirst.next = oldfirst;
    if (oldfirst != null) {
        synchronized(oldfirst) {
            oldfirst.previous = newfirst;
        }
    }
    first = newfirst;
    (size)++;
    if ((size) == 1) {
        last = first;
    }
}