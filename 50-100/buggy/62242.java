public Item sample() {
    if (isEmpty()) {
        throw new java.util.NoSuchElementException();
    }
    int random = StdRandom.uniform(1, size());
    RandomizedQueue<Item>.Node cur = new Node();
    cur = Head.next;
    while ((random > 0) && (cur != (Tail))) {
        cur = cur.next;
        random--;
    } 
    return cur.item;
}