public void addLast(Item item) {
    Deque<Item>.Node newLast = new Node();
    Deque<Item>.Node oldLast = post.prev;
    newLast.item = item;
    oldLast.next = newLast;
    post.prev = newLast;
    newLast.next = post;
    if (isEmpty()) {
        pre.next = newLast;
        newLast.prev = pre;
    }else {
        newLast.prev = oldLast;
    }
    (n)++;
}