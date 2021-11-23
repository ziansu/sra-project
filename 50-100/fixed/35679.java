public Item removeLast() {
    validateRemove();
    Item item = tail.item;
    if ((head) == (tail)) {
        head = null;
        tail = null;
    }else {
        tail.prev.next = null;
        tail = tail.prev;
    }
    (size)--;
    return item;
}