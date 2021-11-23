public boolean isCollison(float x, float y) {
    updateTileValues(x, y);
    return collisionModel.isBlocked();
}