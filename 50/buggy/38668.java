public boolean contains(double x, double y) {
    return ((((minX) <= x) && (x < (maxX))) && ((minY) <= y)) && (y < (maxY));
}