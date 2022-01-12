private boolean withinYBounds(int checkHeight, int i, java.awt.Point point) {
    int heightLowerBounds = ((((i * (checkHeight + (padding))) + (logoY)) + (logoHeight)) + checkHeight) + (padding);
    int heightUpperBounds = heightLowerBounds - checkHeight;
    return (((int) (point.getY())) <= heightLowerBounds) && (((int) (point.getY())) >= heightUpperBounds);
}