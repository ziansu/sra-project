public static TreeNode findCA3(TreeNode root, TreeNode a, TreeNode b) {
    if ((!(findCommonAncestor.cover(root, a))) || (!(findCommonAncestor.cover(root, b)))) {
        return null;
    }
    return findCommonAncestor.ancesterHelper(root, a, b);
}