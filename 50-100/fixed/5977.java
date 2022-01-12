private void setPosition() {
    switch (dir) {
        case LEFT :
            position.setPosition(((bottomLeft.getX()) + 1), bottomLeft.getY());
            break;
        case RIGHT :
            position.setPosition((((topRight.getX()) - (region.getRegionWidth())) - 1), bottomLeft.getY());
            break;
    }
}