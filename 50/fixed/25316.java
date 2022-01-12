private boolean matchingAdjacent(int y, int x) {
    return (c_color[y][x]) == (c_color[(y + 1)][(x + 1)]);
}