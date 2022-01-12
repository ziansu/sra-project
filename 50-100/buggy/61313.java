private void search(KdTree.Node node, edu.princeton.cs.algs4.RectHV rect, java.util.ArrayList<edu.princeton.cs.algs4.Point2D> ret) {
    if (node == null)
        return ;
    
    if (node.rect.intersects(rect)) {
        ret.add(node.p);
        this.search(node.lb, rect, ret);
        this.search(node.rt, rect, ret);
    }
}