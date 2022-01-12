public double distanceTo(Body b) {
    double xDist = (x) - (b.x);
    double yDist = (y) - (b.y);
    return java.lang.Math.sqrt(((java.lang.Math.pow(xDist, 2)) + (java.lang.Math.pow(yDist, 2))));
}