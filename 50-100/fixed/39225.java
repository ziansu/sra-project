public double[] locateRobot(Point refPoint) {
    double yRef = refPoint.getCenterY();
    double xRef = refPoint.getCenterX();
    double yDistance = yRef - (this.yCenter);
    double xDistance = xRef - (this.xCenter);
    double[] location = new double[]{ xRef - xDistance , yRef - yDistance };
    return location;
}