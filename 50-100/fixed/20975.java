public java.util.List<java.lang.Integer> inorderTraversal(utility.TreeNode root) {
    java.util.List<java.lang.Integer> inorderSeqs = new java.util.ArrayList<>();
    java.util.Stack<utility.TreeNode> inorderStack = new java.util.Stack<>();
    pushAllNodesOnLeftPath(root, inorderStack);
    while (!(inorderStack.isEmpty())) {
        utility.TreeNode top = inorderStack.pop();
        inorderSeqs.add(top.val);
        if ((top.right) != null) {
            pushAllNodesOnLeftPath(top.right, inorderStack);
        }
    } 
    return inorderSeqs;
}