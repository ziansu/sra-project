public int compare(Point p1, Point p2) {
    double slope1 = this.slopeTo(p1);
    double slope2 = this.slopeTo(p2);
    return java.lang.Double.compare(slope1, slope2);
}