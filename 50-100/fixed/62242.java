public Item sample() {
    if (isEmpty()) {
        throw new java.util.NoSuchElementException();
    }
    int random;
    if ((size()) == 1) {
        random = 0;
    }else
        random = StdRandom.uniform(0, size());
    
    RandomizedQueue<Item>.Node cur = Head.next;
    while ((random > 0) && ((cur.next) != (Tail))) {
        cur = cur.next;
        random--;
    } 
    return cur.item;
}