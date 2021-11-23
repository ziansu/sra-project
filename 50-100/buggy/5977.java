private void setPosition() {
    switch (dir) {
        case LEFT :
            position.setPosition(bottomLeft.getX(), bottomLeft.getY());
            break;
        case RIGHT :
            position.setPosition(((topRight.getX()) - (region.getRegionWidth())), bottomLeft.getY());
            break;
    }
}