private edu.princeton.cs.algs4.Stack<edu.princeton.cs.algs4.Point2D> range(edu.princeton.cs.algs4.RectHV rect, KdTree.Node node, edu.princeton.cs.algs4.Stack<edu.princeton.cs.algs4.Point2D> points) {
    if (node == null)
        return points;
    
    if (rect.contains(node.p))
        points.push(node.p);
    
    if (rect.intersects(node.rect)) {
        points = range(rect, node.lb, points);
        points = range(rect, node.rt, points);
    }
    return points;
}