public org.jutils.chart.model.Interval zoomIn() {
    double min = this.min;
    double max = this.max;
    double maxTest = java.lang.Math.nextUp(java.lang.Math.nextUp(java.lang.Math.nextUp(java.lang.Math.nextUp(java.lang.Math.nextUp(java.lang.Math.nextUp(min))))));
    if (max > maxTest) {
        double r = (range) / 3.0;
        min += r;
        max -= r;
    }
    return new org.jutils.chart.model.Interval(min, max);
}