public Item removeLast() {
    validateRm();
    Item item = last.item;
    last.item = null;
    last = last.prev;
    last.next = null;
    (N)--;
    if (isEmpty()) {
        first = null;
        last = null;
    }
    assert check();
    return item;
}