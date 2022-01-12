public int nextEntry() {
    if (!(hasNext()))
        throw new java.util.NoSuchElementException();
    
    curr = next;
    if ((index) >= ((order.size) - 1))
        next = -1;
    else
        next = order.get((++(index)));
    
    prev = curr;
    return curr;
}