public void insert(edu.princeton.cs.algs4.Point2D p) {
    if (p == null)
        throw new java.lang.NullPointerException("The input to insert method is null!");
    
    root = insert(root, p, 0, null);
}