private boolean withinXBounds(int checkWidth, int i, java.awt.Point point) {
    int widthLeftBounds = ((width) / 2) - (checkWidth / 2);
    int widthRightBounds = ((width) / 2) + (checkWidth / 2);
    return (((int) (point.getX())) >= widthLeftBounds) && (((int) (point.getX())) <= widthRightBounds);
}