public static TreeNode nextNode(TreeNode n) {
    if (n == null) {
        return null;
    }
    if ((n.right) != null) {
        return Successor.leftLeaf(n.right);
    }
    TreeNode q = n.parent;
    while ((q != null) && ((q.left) != n)) {
        n = q;
        q = q.parent;
    } 
    return q;
}