public Item removeLast() {
    if ((last.previous) != null) {
        Deque<Item>.Node node = last;
        last = last.previous;
        last.next = null;
        (size)--;
        return node.item;
    }else
        if ((last) != null) {
            Deque<Item>.Node node = last;
            first = null;
            last = null;
            (size)--;
            return node.item;
        }else {
            throw new java.util.NoSuchElementException();
        }
    
}