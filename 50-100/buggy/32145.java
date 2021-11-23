public boolean canMoveTo(int x, int y) {
    if ((((x < 8) && (y < 8)) && (x != (xPosition))) && (y != (yPosition))) {
        return true;
    }
    return false;
}