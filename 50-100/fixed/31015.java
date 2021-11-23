private boolean withinYBounds(int checkHeight, int i, int y) {
    int heightUpperBounds = ((((i * (checkHeight + (padding))) + (logoY)) + (logoHeight)) + checkHeight) + (padding);
    int heightLowerBounds = heightUpperBounds + checkHeight;
    return (y <= heightLowerBounds) && (y >= heightUpperBounds);
}