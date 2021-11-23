public edu.princeton.cs.algs4.Point2D nearest(edu.princeton.cs.algs4.Point2D p) {
    if (isEmpty())
        return null;
    
    java.util.Iterator<edu.princeton.cs.algs4.Point2D> iter = points.iterator();
    edu.princeton.cs.algs4.Point2D min = iter.next();
    double minDist = p.distanceSquaredTo(min);
    while (iter.hasNext()) {
        edu.princeton.cs.algs4.Point2D tmp = iter.next();
        double tmpDist = p.distanceSquaredTo(tmp);
        if (minDist < tmpDist) {
            min = tmp;
            minDist = tmpDist;
        }
    } 
    return min;
}