public Item removeFirst() {
    if ((first) == null) {
        throw new java.util.NoSuchElementException();
    }else
        if ((first.next) != null) {
            Deque<Item>.Node node = first;
            first = first.next;
            first.previous = null;
            (size)--;
            return node.item;
        }else {
            Deque<Item>.Node node = first;
            first = null;
            last = null;
            (size)--;
            return node.item;
        }
    
}