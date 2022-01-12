public void addFirst(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException();
    
    Deque<Item>.Node temp = new Node();
    temp.item = item;
    if (isEmpty()) {
        last = temp;
    }else {
        temp.next = first;
        first.prev = null;
    }
    first = temp;
    (size)++;
}