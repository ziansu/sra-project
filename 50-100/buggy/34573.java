private static java.awt.Point nextBreakpoint(java.awt.Point startingPoint, double hypLen, double angle) {
    double transX = hypLen * (java.lang.Math.cos(angle));
    double transY = hypLen * (java.lang.Math.sin(angle));
    java.awt.Point nextPt = startingPoint.getLocation();
    nextPt.translate(((int) (java.lang.Math.rint(transX))), ((int) (java.lang.Math.rint(transY))));
    return nextPt;
}