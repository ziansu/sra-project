public double[] tankdrive(double x, double y, double left, double right) {
    right = (y / 50) * 100;
    left = (x / 50) * 100;
    return new double[]{ left , right };
}