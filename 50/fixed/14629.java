public static double[] returnSides() {
    double leftSide;
    double rightSide;
    leftSide = Processing.r1.x;
    rightSide = (Processing.r1.x) + (Processing.r1.width);
    Processing.sideX = new double[]{ leftSide , rightSide };
    return Processing.sideX;
}