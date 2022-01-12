private double calcSlope() {
    double xDiff = (this.getPoint2().x) - (this.getPoint1().x);
    double yDiff = (this.getPoint2().y) - (this.getPoint1().y);
    if (yDiff == 0.0) {
        return java.lang.Double.NaN;
    }
    return xDiff / yDiff;
}