public void insert(Point2D p) {
    KdTree.Node current = root;
    KdTree.Node newNode = new KdTree.Node(p);
    if ((root) == null) {
        newNode.setOppDirection("y");
        RectHV rect = new RectHV(0, 0, 1, 1);
        newNode.setRect(rect);
        root = newNode;
        return ;
    }
    traverseInsert(current, newNode, null, null);
    (sizeNum)++;
}