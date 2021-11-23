public void setLogMinMax(double min, double max, boolean keepOverridenIntervals) {
    this.logMin = min;
    this.logMax = max;
    this.format = null;
    if (keepOverridenIntervals) {
        return ;
    }
    calcLogIntervals(palette, logMin, logMax);
}