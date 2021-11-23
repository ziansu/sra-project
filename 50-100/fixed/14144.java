public void addLast(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    Deque<Item>.Node newLast = new Node();
    Deque<Item>.Node oldLast = post.prev;
    newLast.item = item;
    post.prev = newLast;
    newLast.next = post;
    oldLast.next = newLast;
    if (isEmpty()) {
        pre.next = newLast;
        newLast.prev = pre;
    }else {
        newLast.prev = oldLast;
    }
    (n)++;
}