public void delete(TreeNode node) {
    if (node == null) {
        java.lang.System.out.println("Warning: node is null.");
        return ;
    }
    node.appearsUninitialized();
    recursiveDelete(root, node);
}