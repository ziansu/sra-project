public void addLast(Item item) {
    if (this.checkNull(item))
        throw new java.util.NoSuchElementException();
    
    if ((tail) == null) {
        tail = new Deque.Node();
        tail.item = item;
        head = tail;
    }else {
        tail.prev = new Deque.Node();
        tail.prev.next = tail;
        tail = tail.prev;
        tail.item = item;
    }
    count += 1;
}