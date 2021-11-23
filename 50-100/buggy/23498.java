private void append(E e) {
    if (this.isEmpty()) {
        this.makeFirstNode(e);
    }else {
        this.bottom.next = new StackNode(e);
        this.bottom = this.bottom.next;
    }
    (this.size)++;
}