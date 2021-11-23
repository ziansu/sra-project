public void nonRecPreOrder(BinaryTree.TreeNode p) {
    java.util.Stack<BinaryTree.TreeNode> stack = new java.util.Stack<BinaryTree.TreeNode>();
    BinaryTree.TreeNode node = p;
    while ((node != null) || ((stack.size()) > 0)) {
        while (node != null) {
            visted(node);
            stack.push(node);
            node = node.leftChild;
        } 
        if ((stack.size()) > 0) {
            node = stack.pop();
            node = node.rightChild;
        }
    } 
}