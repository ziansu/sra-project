public boolean isInBounds(int xIndex, int yIndex) {
    return ((xIndex >= (minX)) && (xIndex <= (maxX))) && ((yIndex >= (minY)) && (yIndex <= (maxY)));
}