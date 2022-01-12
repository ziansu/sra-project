public void addFirst(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException("input data is null");
    
    Deque<Item>.Node add = new Node(item);
    if (isEmpty()) {
        left = right = add;
    }else {
        add.next = left;
        left.prev = add;
        left = add;
    }
    (N)++;
}