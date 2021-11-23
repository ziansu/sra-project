public void addLast(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException("input data is null");
    
    Deque<Item>.Node add = new Node(item);
    if (isEmpty()) {
        left = add;
        right = add;
    }else {
        add.prev = right;
        right.next = add;
        right = add;
    }
    (N)++;
}