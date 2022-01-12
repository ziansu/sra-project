public void insert(edu.princeton.cs.algs4.Point2D p) {
    if ((this.root.p) == null) {
        this.root.p = p;
        this.root.rect = new edu.princeton.cs.algs4.RectHV(0, 0, 1, 1);
    }else {
        this.add(this.root, p, true);
    }
}