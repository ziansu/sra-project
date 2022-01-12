public int rob(leetcode.Problem337.TreeNode root) {
    if (root == null) {
        return 0;
    }
    java.util.Map<leetcode.Problem337.TreeNodeWrapper, java.lang.Integer> memo = new java.util.HashMap<>();
    int a = rob(root, false, memo);
    int b = rob(root, true, memo);
    return java.lang.Math.max(a, b);
}