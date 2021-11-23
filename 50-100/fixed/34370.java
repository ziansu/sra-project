public int sumNumbers(utility.TreeNode root) {
    java.util.List<java.lang.Integer> rootToLeafNumbers = new java.util.ArrayList<>();
    if (root != null) {
        depthFirstSearch(rootToLeafNumbers, root, 0);
    }
    int sum = 0;
    for (java.lang.Integer num : rootToLeafNumbers) {
        sum += num;
    }
    return sum;
}