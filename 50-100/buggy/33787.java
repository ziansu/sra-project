double heuristics(leastplanningdstar.State a, leastplanningdstar.State b) {
    double temp;
    double min = java.lang.Math.abs(((a.getX()) - (b.getX())));
    double max = java.lang.Math.abs(((a.getY()) - (a.getY())));
    if (min > max) {
        temp = min;
        min = max;
        max = temp;
    }
    return max;
}