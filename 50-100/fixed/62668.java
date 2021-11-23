public boolean isOutOfBounds(utilities.Vector2i vec) {
    if (((((vec.getX()) < 0) || ((vec.getY()) < 0)) || ((vec.getX()) >= (gridSize))) || ((vec.getY()) >= (gridSize))) {
        return true;
    }
    return false;
}