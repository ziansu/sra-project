public static void main(java.lang.String[] args) {
    org.hanjia.leetcode.tree.TreeNode root = new org.hanjia.leetcode.tree.TreeNode(1);
    root.left = new org.hanjia.leetcode.tree.TreeNode(2);
    root.right = new org.hanjia.leetcode.tree.TreeNode(3);
    root.left.left = new org.hanjia.leetcode.tree.TreeNode(4);
    root.left.right = new org.hanjia.leetcode.tree.TreeNode(5);
    root.right.left = new org.hanjia.leetcode.tree.TreeNode(6);
    root.right.right = new org.hanjia.leetcode.tree.TreeNode(7);
    org.hanjia.leetcode.tree.Problem94_BinaryTreeInOrderTraversal inorder = new org.hanjia.leetcode.tree.Problem94_BinaryTreeInOrderTraversal();
    java.lang.System.out.println(inorder.inorderTraversal(root));
}