void addLast(T value) {
    if ((head) == null) {
        head = tail = new Node(value);
        head.index = 0;
    }else {
        tail.next = new Node(value, tail, null);
        tail.next.index = (tail.index) + 1;
        tail = tail.next;
    }
    size += 1;
}