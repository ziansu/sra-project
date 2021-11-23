private void setCoords() {
    leftX = (HomeList.maxWidth) / 2;
    topY = (HomeList.maxHeight) / 2;
    rightX = (leftX) + (2 * (radius));
    bottomY = (topY) + (2 * (radius));
    findCentre();
}