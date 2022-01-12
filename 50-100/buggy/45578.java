public double[] tankdrive(double x, double y, double left, double right) {
    left = 255;
    right = 255;
    right = (y / 50) * 100;
    left = (x / 50) * 100;
    java.lang.System.out.print(((left + " : ") + right));
    return new double[]{ left , right };
}