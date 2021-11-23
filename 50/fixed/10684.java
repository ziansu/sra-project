public void insert(edu.princeton.cs.algs4.Point2D p) {
    if (p == null)
        throw new java.lang.NullPointerException();
    
    root = insert(root, p, 0.0, 0.0, 1.0, 1.0, true);
}