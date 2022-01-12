public static void main(java.lang.String[] args) {
    com.su.leetCode.easy.multiple.TreeNode tn = new com.su.leetCode.easy.multiple.TreeNode(10);
    tn.left = new com.su.leetCode.easy.multiple.TreeNode(12);
    tn.right = new com.su.leetCode.easy.multiple.TreeNode(13);
    tn.left.left = new com.su.leetCode.easy.multiple.TreeNode(12);
    tn.left.right = new com.su.leetCode.easy.multiple.TreeNode(13);
    java.lang.System.out.println(com.su.leetCode.easy.multiple.Problem437PathSum3.pathSum(tn, 23));
}