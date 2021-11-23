public void insert(edu.princeton.cs.algs4.Point2D p) {
    if (p == null)
        throw new java.lang.NullPointerException("point should not be null");
    
    if ((root) == null) {
        root = new KdTree.Node(p, new edu.princeton.cs.algs4.RectHV(0, 0, 1, 1));
        (size)++;
    }else {
        insert(root, root, p, true);
    }
}