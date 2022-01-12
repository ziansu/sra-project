public void insert(edu.princeton.cs.algs4.Point2D p) {
    if (p == null)
        throw new java.lang.NullPointerException();
    
    root = insert(root, p, new edu.princeton.cs.algs4.RectHV(0.0, 0.0, 1.0, 1.0), true);
}