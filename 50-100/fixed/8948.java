public boolean move(int destX, int destY) {
    if (isFirst = true) {
        if (destX == ((this.y) + 2)) {
            isFirst = false;
            return true;
        }
    }
    if (destX == ((this.y) + 1)) {
        isFirst = false;
        return true;
    }
    return false;
}