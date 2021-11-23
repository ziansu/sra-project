public Item removeLast() {
    if ((count) <= 0)
        throw new java.util.NoSuchElementException();
    
    (count)--;
    Deque<Item>.Node result = last;
    if ((count) <= 0) {
        first = null;
        last = null;
    }else {
        last = last.previous;
    }
    return result.item;
}