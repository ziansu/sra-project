public double speed() {
    long c = super.diff();
    if (c == 0) {
        return 0;
    }
    return ((double) ((current) - (last))) / c;
}