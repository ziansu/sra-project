public double findVerticalDiff(int centerY) {
    double distance = ultra.getRangeMM();
    int yDifference = (targetY) - centerY;
    double angle = 0.0;
    int isNegative = 1;
    if ((xDifference) < 0) {
        isNegative = -1;
    }
    yDifference = java.lang.Math.abs(xDifference);
    return angle * isNegative;
}