public static int height(TreeNode root) {
    if (root == null)
        return -1;
    
    int leftDepth = TreeNode.height(root.left);
    int rightDepth = TreeNode.height(root.right);
    int bigger = java.lang.Math.max(leftDepth, rightDepth);
    return bigger + 1;
}