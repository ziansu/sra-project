public double getDistance(double[] ourLocation, double[] goLocation) {
    double xDiff = java.lang.Math.abs(((ourLocation[0]) - (goLocation[0])));
    double yDiff = java.lang.Math.abs(((ourLocation[1]) - (goLocation[1])));
    double sumOfSquares = (java.lang.Math.pow(xDiff, 2)) + (java.lang.Math.pow(yDiff, 2));
    return java.lang.Math.sqrt(sumOfSquares);
}