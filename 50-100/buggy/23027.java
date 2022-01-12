public Point2D nearest(Point2D p) {
    Point2D nearest = null;
    if (points.isEmpty()) {
        return nearest;
    }
    double min = 0;
    for (Point2D point : points) {
        double curr = p.distanceTo(point);
        if (curr < min) {
            min = curr;
            nearest = point;
        }
    }
    return nearest;
}