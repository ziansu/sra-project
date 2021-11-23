private void traverseRange(KdTree.Node node, RectHV rect, java.util.ArrayList<Point2D> results) {
    if (node == null) {
        return ;
    }
    if (rect.contains(node.point())) {
        results.add(node.point());
    }
    if (node.getRect().intersects(rect)) {
        traverseRange(node.right(), rect, results);
        traverseRange(node.left(), rect, results);
    }
}