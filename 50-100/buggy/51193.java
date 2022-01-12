public int rob(leetcode.Problem337.TreeNode root) {
    if (root == null) {
        return 0;
    }
    java.util.Map<leetcode.Problem337.TreeNodeWrapper, java.lang.Integer> memo = new java.util.HashMap<>();
    int a = rob(root, false, 0, memo);
    int b = rob(root, true, 0, memo);
    return java.lang.Math.max(a, b);
}