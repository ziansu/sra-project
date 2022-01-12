public edu.princeton.cs.algs4.Point2D nearest(edu.princeton.cs.algs4.Point2D p) {
    edu.princeton.cs.algs4.Point2D ans = container.min();
    double mindist = ans.distanceSquaredTo(p);
    for (edu.princeton.cs.algs4.Point2D item : container) {
        if ((item.distanceSquaredTo(p)) < mindist) {
            ans = item;
            mindist = ans.distanceSquaredTo(p);
        }
    }
    return ans;
}