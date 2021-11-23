public com.javapractice.leetcode.TreeNode convertBST(com.javapractice.leetcode.TreeNode root) {
    java.util.List<com.javapractice.leetcode.TreeNode> traverse = preorderTraverse(root);
    changeValue(traverse);
    return root;
}