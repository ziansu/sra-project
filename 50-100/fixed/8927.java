protected boolean isInBounds(int x, int y) {
    if ((((x >= 0) && (x < (this.width))) && (y >= 0)) && (y < (this.height))) {
        return true;
    }
    return false;
}