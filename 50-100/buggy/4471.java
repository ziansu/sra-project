public java.util.List<java.util.LinkedList<java.lang.Integer>> pathSum(TreeNode root, int sum) {
    java.util.ArrayList<java.util.LinkedList<java.lang.Integer>> res = new java.util.ArrayList<java.util.LinkedList<java.lang.Integer>>();
    java.util.LinkedList<java.lang.Integer> cur = new java.util.LinkedList<java.lang.Integer>();
    pathSum(root, sum, cur, res);
    return res;
}