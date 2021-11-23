public int countTilesOutOfOrder() {
    int count = 0;
    for (int y = 0; y < 3; y++) {
        for (int x = 0; x < 3; x++) {
            if ((x == 2) && (y == 2)) {
                continue;
            }
            if (((getIndex(x, y)) + 1) != (getValue(x, y))) {
                count++;
            }
        }
    }
    return count;
}