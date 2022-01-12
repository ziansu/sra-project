public java.lang.Iterable<edu.princeton.cs.algs4.Point2D> range(edu.princeton.cs.algs4.RectHV rect) {
    if (rect == null) {
        throw new java.lang.NullPointerException();
    }
    edu.princeton.cs.algs4.Stack<edu.princeton.cs.algs4.Point2D> points = new edu.princeton.cs.algs4.Stack<edu.princeton.cs.algs4.Point2D>();
    KdTree.Node node = root;
    if (node != null) {
        range(rect, node, points);
    }
    return points;
}