public boolean isBeyondBoundary(Location location) {
    int x = location.getLocationX();
    int y = location.getLocationY();
    if ((((x >= 0) && (x < (mRows))) && (y >= 0)) && (y < (mColumns))) {
        return true;
    }
    return false;
}