public boolean detectWallCollision(java.awt.Dimension size) {
    if (((posX) > (size.getWidth())) || ((posY) > (size.getWidth()))) {
        return true;
    }
    if (((posX) < 0) || ((posY) < 0)) {
        return true;
    }
    return false;
}