public Item removeLast() {
    validateRm();
    Item item = last.item;
    last.item = null;
    last.next = null;
    last = last.prev;
    (N)--;
    if (isEmpty()) {
        first = null;
        last = null;
    }
    assert check();
    return item;
}