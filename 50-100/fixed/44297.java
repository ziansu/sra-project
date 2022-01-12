public void addLast(Item item) {
    validateAdd(item);
    (counter)++;
    Deque<Item>.Node oldLast = last;
    last = new Node();
    last.item = item;
    last.previous = oldLast;
    if (oldLast != null) {
        oldLast.next = last;
    }
    if ((counter) <= 1) {
        first = last;
    }
}