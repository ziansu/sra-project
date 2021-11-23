public wr.leetcode.algo.binary_tree_upside_down.Solution.TreeNode UpsideDownBinaryTree2(wr.leetcode.algo.binary_tree_upside_down.Solution.TreeNode root) {
    wr.leetcode.algo.binary_tree_upside_down.Solution.TreeNode p = root;
    wr.leetcode.algo.binary_tree_upside_down.Solution.TreeNode parent = null;
    wr.leetcode.algo.binary_tree_upside_down.Solution.TreeNode right = null;
    while (p != null) {
        wr.leetcode.algo.binary_tree_upside_down.Solution.TreeNode left = p.left;
        p.left = right;
        right = p.right;
        p.right parent;
        parent = p;
        p = left;
    } 
    return parent;
}