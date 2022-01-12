private boolean inRange(double a, double b, double span) {
    return (a > (b - span)) && (a < (b + span));
}