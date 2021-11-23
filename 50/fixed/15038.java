private double findDistance(T point, double x) {
    double pointX = this.xAxisMetric.compute(point);
    return java.lang.Math.abs((pointX - x));
}