private void balanceRR(cs143.dataaccess.TreeNode a, cs143.dataaccess.TreeNode parentOfA) {
    cs143.dataaccess.TreeNode b = a.right;
    if (a == (root)) {
        root = b;
    }else
        if ((parentOfA.left) == a) {
            parentOfA.left = b;
        }else {
            parentOfA.right = a;
        }
    
    a.right = b.left;
    b.left = a;
    updateHeight(((cs143.dataaccess.SsnAvl.AVLTreeNode) (a)));
    updateHeight(((cs143.dataaccess.SsnAvl.AVLTreeNode) (b)));
}