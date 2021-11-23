public boolean inBounds(int x, int y) {
    return !(((x < 1) || (x >= ((floorWidth) - 1))) || ((y < 1) || (y >= ((floorHeight) - 1))));
}