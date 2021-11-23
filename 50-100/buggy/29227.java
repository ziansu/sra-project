public java.lang.Iterable<edu.princeton.cs.algs4.Point2D> range(edu.princeton.cs.algs4.RectHV rect) {
    if (rect == null)
        throw new java.lang.NullPointerException();
    
    java.util.ArrayList<edu.princeton.cs.algs4.Point2D> range = new java.util.ArrayList<edu.princeton.cs.algs4.Point2D>();
    range(rect, root, true, range);
    return range;
}