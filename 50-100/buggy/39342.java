public Item removeFirst() {
    if (isEmpty())
        throw new java.util.NoSuchElementException("sorry can't remove from an empty deque");
    
    Item item = firstP.item;
    if ((firstP.nxt) == (lastP)) {
        firstP.item = null;
    }else {
        firstP = firstP.nxt;
    }
    len -= 1;
    return item;
}