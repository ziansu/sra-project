public void addFirst(Item item) throws java.lang.NullPointerException {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
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