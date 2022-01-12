public wr.leetcode.algo.binary_tree_upside_down.Solution.TreeNode UpsideDownBinaryTree(wr.leetcode.algo.binary_tree_upside_down.Solution.TreeNode root) {
    wr.leetcode.algo.binary_tree_upside_down.Solution.TreeNode curr = new wr.leetcode.algo.binary_tree_upside_down.Solution.TreeNode((-1));
    wr.leetcode.algo.binary_tree_upside_down.Solution.TreeNode next = new wr.leetcode.algo.binary_tree_upside_down.Solution.TreeNode((-1));
    wr.leetcode.algo.binary_tree_upside_down.Solution.TreeNode node = root;
    if (root == null) {
        return node;
    }
    curr.left = node.left;
    curr.right = node.right;
    while ((curr.left) != null) {
        next.left = curr.left.left;
        next.right = curr.right.right;
        curr.left.right = node;
        curr.left.left = curr.right;
        node = curr.left;
        curr.left = next.left;
        curr.right = next.right;
    } 
    return node;
}