public void addFirst(Item item) {
    if ((head) == null) {
        head = new Node();
        tail = head;
    }else {
        head.previous = new Node();
        head.previous.next = head;
        head = head.previous;
    }
    head.item = item;
    (sizeNum)++;
}