public org.jutils.chart.model.Interval zoomIn() {
    double r;
    double min = this.min;
    double max = this.max;
    r = (range) / 3.0;
    double maxTest = java.lang.Math.nextUp(java.lang.Math.nextUp(java.lang.Math.nextUp(java.lang.Math.nextUp(java.lang.Math.nextUp(java.lang.Math.nextUp(min))))));
    if (max > maxTest) {
        min += r;
        max -= r;
    }
    return new org.jutils.chart.model.Interval(min, max);
}