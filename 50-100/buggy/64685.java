public java.util.List<java.util.List<java.lang.Integer>> pathSum(utility.TreeNode root, int sum) {
    java.util.List<java.util.List<java.lang.Integer>> allPaths = new java.util.LinkedList<>();
    java.util.List<java.lang.Integer> currPath = new java.util.LinkedList<>();
    if (root != null) {
        currPath.add(root.val);
        depthFirstSearch(allPaths, currPath, root, (sum - (root.val)));
    }
    return allPaths;
}