public double RRS(double start, double end, int numberOfIntervals) {
    double deltaX = (end - start) / numberOfIntervals;
    return LRS((start + deltaX), end, numberOfIntervals);
}