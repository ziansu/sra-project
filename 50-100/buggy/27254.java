public double[] reflectPoint(double x, double y) {
    double[] newLocation = new double[2];
    newLocation[0] = y - ((x * (gradient)) + (yOffset));
    newLocation[1] = x - (y * (-(gradient)));
}