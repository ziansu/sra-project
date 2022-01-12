public Item removeFirst() {
    validateRemove();
    Item item = head.item;
    if ((head) == (tail)) {
        head = null;
        tail = null;
    }else {
        head.next.prev = null;
        head = head.next;
    }
    (size)--;
    return item;
}