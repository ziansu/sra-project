@java.lang.SuppressWarnings(value = "deprecation")
public double getRawCenterX() {
    double[] x = table.getNumberArray("centerX");
    if ((x == null) || ((x.length) < 2)) {
        return -2;
    }else {
        double x1 = x[0];
        double x2 = x[1];
        double center = (x1 + x2) / 2;
        return center;
    }
}