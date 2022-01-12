public void getMassData(double[] x, double[] y) {
    getCurve(0).clearPoints();
    for (int k = 0; k < (x.length); ++k) {
        getCurve(0).addPoint(x[k], y[k]);
    }
}