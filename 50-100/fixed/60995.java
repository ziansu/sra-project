private int increaseIndex() {
    int i = this.index;
    this.index = (i + 1) % (this.size());
    if ((this.index) == 0) {
        this.complete = true;
    }
    return i;
}