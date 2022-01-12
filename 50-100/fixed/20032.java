protected boolean withinDist(int x1, int y1, int x2, int y2, int range) {
    double number = java.lang.Math.sqrt(((java.lang.Math.pow((x1 - x2), 2)) + (java.lang.Math.pow((y1 - y2), 2))));
    return number < range;
}