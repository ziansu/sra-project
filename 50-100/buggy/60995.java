private int increaseIndex() {
    int i = this.index;
    if (i >= (this.size())) {
        this.complete = true;
    }
    this.index = (i + 1) % (this.size());
    return i;
}