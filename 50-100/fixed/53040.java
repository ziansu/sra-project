public java.lang.Iterable<edu.princeton.cs.algs4.Point2D> range(edu.princeton.cs.algs4.RectHV rect) {
    if (rect == null)
        throw new java.lang.NullPointerException();
    
    java.util.Iterator<edu.princeton.cs.algs4.Point2D> bstPoints = bst.iterator();
    edu.princeton.cs.algs4.Stack<edu.princeton.cs.algs4.Point2D> stack = new edu.princeton.cs.algs4.Stack();
    while (bstPoints.hasNext()) {
        edu.princeton.cs.algs4.Point2D point = bstPoints.next();
        if (rect.contains(point)) {
            stack.push(point);
        }
    } 
    return stack;
}