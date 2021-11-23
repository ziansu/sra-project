public gololang.IntRange incrementBy(int value) {
    this.increment = value;
    if (value < 0) {
        this.cmp = -1;
    }else {
        this.cmp = 1;
    }
    return this;
}