public void prev() {
    this.curr.prev = this.curr.prev.prev;
    this.curr.next = this.curr.prev;
    if ((this.pos) == 0) {
        this.pos = (this.size) - 1;
    }else {
        (this.pos)--;
    }
}