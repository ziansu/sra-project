public static void printTree(TreeNode root) {
    if (root == null) {
        return ;
    }
    if ((root.left) != null) {
        TreeNode.printTree(root.left);
    }else
        if (root != null) {
            java.lang.System.out.print(((root.val) + " "));
        }
    
    if ((root.right) != null) {
        TreeNode.printTree(root.right);
    }
}