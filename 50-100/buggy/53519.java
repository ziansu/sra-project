public void addFirst(final Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    head = new Node() {
        {
            this.value = item;
            this.next = head;
            this.previous = null;
        }
    };
    if (isEmpty()) {
        tail = head;
    }else {
        head.next.previous = head;
    }
    (size)++;
}