public void tranverse(KdTree.KdTreeNode node, edu.princeton.cs.algs4.RectHV rect, java.util.ArrayList<edu.princeton.cs.algs4.Point2D> arr) {
    if (node == null) {
        return ;
    }
    tranverse(node.getLChild(), rect, arr);
    if (rect.contains(node.getPoint())) {
        arr.add(node.getPoint());
    }
    tranverse(node.getRChild(), rect, arr);
}