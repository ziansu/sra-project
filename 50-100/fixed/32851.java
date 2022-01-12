public void insert(edu.princeton.cs.algs4.Point2D p) {
    if (p == null)
        throw new java.lang.NullPointerException();
    
    if ((mRoot) == null) {
        mRoot = new KdTree.KdTreeNode(p, KdTree.KdTreeNode.VERTICAL);
    }else {
        mRoot.insert(p);
    }
    (mSize)++;
}