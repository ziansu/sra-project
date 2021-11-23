public boolean spawn(int x1, int y1) {
    x = x1;
    y = y1;
    updateXSquares();
    updateYSquares();
    if (canEnterAll(x, y, false)) {
        enterAll(x, y);
        return true;
    }
    return false;
}