public void insert(edu.princeton.cs.algs4.Point2D p) {
    java.util.Comparator<edu.princeton.cs.algs4.Point2D> comparatorX = edu.princeton.cs.algs4.Point2D.X_ORDER;
    if ((root.point) == null) {
        root.point = p;
        root.rect = new edu.princeton.cs.algs4.RectHV(0, 0, 1, 1);
    }else {
        insertNode(root, p, root.rect, comparatorX);
    }
}