public void place(int x, int y, int id) {
    int blockSize = ((int) ((size) * (zoom)));
    map[((int) ((x + (viewPosition.x)) / blockSize))][((int) ((y + (viewPosition.y)) / blockSize))].setId(1);
}