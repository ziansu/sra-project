public static int diameterOfBinaryTree(xtq.leetcode.algorithms2.TreeNode root) {
    if (root == null)
        return 0;
    
    xtq.leetcode.algorithms2.DiameterofBinaryTree.getDepth(root);
    return xtq.leetcode.algorithms2.DiameterofBinaryTree.Max;
}