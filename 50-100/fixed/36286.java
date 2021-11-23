public double findVerticalDiff(int centerY) {
    double distance = ultra.getRangeMM();
    int yDifference = (targetY) - centerY;
    double angle = 0.0;
    int isNegative = 1;
    if (yDifference < 0) {
        isNegative = -1;
    }
    yDifference = java.lang.Math.abs(yDifference);
    return angle * isNegative;
}