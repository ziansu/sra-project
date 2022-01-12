private void range(KdTree.Node node, edu.princeton.cs.algs4.RectHV rect) {
    if (!(node.rect.intersects(rect)))
        return ;
    
    if ((node.point) == null)
        return ;
    
    if (rect.contains(node.point))
        range.add(node.point);
    
    range(node.left, rect);
    range(node.right, rect);
}