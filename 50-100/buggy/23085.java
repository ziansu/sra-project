public void prev() {
    this.curr.prev = this.curr.prev.prev;
    this.curr.next = this.curr.prev;
    if ((this.pos) == 0) {
        this.pos = (this.size) - 1;
    }
    (this.pos)--;
    if ((this.pos) == (-1)) {
        this.pos = (this.size) - 1;
    }
}