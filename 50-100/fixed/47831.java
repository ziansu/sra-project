public double distanceTo(Body b) {
    double xDist = (b.x) - (x);
    double yDist = (b.y) - (y);
    return java.lang.Math.sqrt(((java.lang.Math.pow(xDist, 2)) + (java.lang.Math.pow(yDist, 2))));
}