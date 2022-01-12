public Item removeFirst() {
    if ((first.next) != null) {
        Deque<Item>.Node node = first;
        first = first.next;
        first.previous = null;
        (size)--;
        return node.item;
    }else
        if ((first) != null) {
            Deque<Item>.Node node = first;
            first = null;
            last = null;
            (size)--;
            return node.item;
        }else {
            throw new java.util.NoSuchElementException();
        }
    
}