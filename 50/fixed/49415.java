public gololang.LongRange incrementBy(long value) {
    this.increment = value;
    if (value < 0) {
        this.cmp = -1;
    }else {
        this.cmp = 1;
    }
    return this;
}