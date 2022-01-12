public boolean isInside(int x, int y) {
    return !((((x < 0) || (x >= (BOARD_HEIGHT))) || (y < 0)) || (y >= (BOARD_WIDTH)));
}