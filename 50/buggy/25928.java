public boolean isColliding(java.awt.geom.Rectangle2D mask, java.awt.Point offset) {
    if (hasChildren()) {
        if (findCollision(this, mask, offset)) {
            return true;
        }
    }
    return false;
}