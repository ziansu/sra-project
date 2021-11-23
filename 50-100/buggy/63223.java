private utility.TreeNode buildTreeRecurse(int start, int end) {
    if (end > start) {
        return null;
    }
    int rootIndex = ((end - start) / 2) + start;
    utility.TreeNode leftSubtree = buildTreeRecurse(start, (rootIndex - 1));
    utility.TreeNode root = new utility.TreeNode(nextNode.val);
    nextNode = nextNode.next;
    utility.TreeNode rightSubtree = buildTreeRecurse((rootIndex + 1), end);
    root.left = leftSubtree;
    root.right = rightSubtree;
    return root;
}