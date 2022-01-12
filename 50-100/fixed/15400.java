public java.util.List<com.javapractice.leetcode.TreeNode> preorderTraverse(com.javapractice.leetcode.TreeNode root) {
    java.util.List<com.javapractice.leetcode.TreeNode> list = new java.util.ArrayList<>();
    if (root != null) {
        list.addAll(preorderTraverse(root.left));
        list.add(root);
        list.addAll(preorderTraverse(root.right));
    }
    return list;
}