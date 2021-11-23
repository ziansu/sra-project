public boolean isBomb(int x, int y) {
    if ((bombArray[x][y]) == true) {
        return true;
    }
    return false;
}