public double speed() {
    long c = super.diff();
    return ((double) ((current) - (last))) / c;
}