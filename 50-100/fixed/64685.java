public java.util.List<java.util.List<java.lang.Integer>> pathSum(utility.TreeNode root, int sum) {
    java.util.List<java.util.List<java.lang.Integer>> allPaths = new java.util.LinkedList<>();
    java.util.List<java.lang.Integer> currPath = new java.util.LinkedList<>();
    depthFirstSearch(allPaths, currPath, root, sum);
    return allPaths;
}