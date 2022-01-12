public void inOrder(TreeNode current) {
    if (current == null) {
        inOrder(root);
    }else {
        if ((current.getLeft()) != null) {
            inOrder(current.getLeft());
        }
        if ((current.getRight()) != null) {
            inOrder(current.getRight());
        }
    }
}