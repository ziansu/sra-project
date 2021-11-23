public com.javapractice.leetcode.List<com.javapractice.leetcode.TreeNode> preorderTraverse(com.javapractice.leetcode.TreeNode root) {
    com.javapractice.leetcode.List<com.javapractice.leetcode.TreeNode> list = new com.javapractice.leetcode.ArrayList();
    if (root != null) {
        list.addAll(preorderTraverse(root.left));
        list.add(root);
        list.addAll(preorderTraverse(root.right));
    }
    return list;
}