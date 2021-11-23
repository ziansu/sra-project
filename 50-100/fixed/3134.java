public int clearRows() {
    int n = 0;
    for (int i = 0; i < (this.height); i++) {
        if (clearRow(i)) {
            n += 1;
            i -= 1;
        }
    }
    int s = 0;
    for (int i = 0; i < n; ++i) {
        s += 100 * (2 ^ n);
    }
    return s;
}