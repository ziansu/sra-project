public Item removeLast() {
    if ((count) <= 0)
        throw new java.util.NoSuchElementException();
    
    (count)--;
    Item result = last.item;
    if ((count) <= 0) {
        first = null;
        last = null;
    }else {
        last = last.previous;
    }
    return result;
}