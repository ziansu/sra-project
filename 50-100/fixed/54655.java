public Item removeLast() {
    if (isEmpty())
        throw new java.util.NoSuchElementException();
    
    Item result = last.item;
    if ((size) == 1) {
        first = null;
        last = null;
    }else {
        last = last.prev;
        last.next = null;
    }
    (size)--;
    return result;
}