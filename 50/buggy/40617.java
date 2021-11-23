public edu.princeton.cs.algs4.Point2D nearest(edu.princeton.cs.algs4.Point2D p) {
    checkForNull(p, "A point cannot be null");
    return nearest(p, root, true, 1.0, root.point);
}