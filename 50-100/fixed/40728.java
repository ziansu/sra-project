private boolean isWithinBounds(int x, int y) {
    boolean withinBounds = true;
    if ((((x > ((this.COLUMNS) - 1)) || (x < 0)) || (y > ((this.ROWS) - 1))) || (y < 0)) {
        withinBounds = false;
    }
    return withinBounds;
}