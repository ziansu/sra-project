public static void printTree(TreeNode root) {
    if (root == null) {
        return ;
    }
    if ((root.left) != null) {
        TreeNode.printTree(root.left);
    }
    java.lang.System.out.print(((root.val) + " "));
    if ((root.right) != null) {
        TreeNode.printTree(root.right);
    }
}