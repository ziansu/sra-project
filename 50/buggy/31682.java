public boolean getPointAt(int x, int y) {
    if ((x < (getWidth())) && (y < (getHeight()))) {
        return piece[y][x];
    }
}