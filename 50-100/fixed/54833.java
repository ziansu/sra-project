private boolean withinXBounds(int checkWidth, int i, int x) {
    int widthLeftBounds = ((width) / 2) - (checkWidth / 2);
    int widthRightBounds = ((width) / 2) + (checkWidth / 2);
    return (x >= widthLeftBounds) && (x <= widthRightBounds);
}