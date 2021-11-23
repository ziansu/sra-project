public void insertLeft(int id, TreeNode parent) {
    TreeNode newNode = new TreeNode(id);
    parent.left = newNode;
}