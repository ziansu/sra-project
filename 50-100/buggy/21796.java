public void addLast(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException();
    
    Deque<Item>.Node temp = new Node();
    temp.item = item;
    if (isEmpty()) {
        temp.prev = null;
        first = temp;
    }else {
        temp.prev = last;
        last.next = temp;
    }
    last = temp;
    (size)++;
}