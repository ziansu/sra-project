public boolean shift(char c, boolean mark) {
    this.marked = this.re.shift(c, (mark || (this.marked)));
    return this.marked;
}