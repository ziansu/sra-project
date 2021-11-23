public void insertLeft(TreeNode parent, int id) {
    TreeNode newNode = new TreeNode(id);
    parent.left = newNode;
}