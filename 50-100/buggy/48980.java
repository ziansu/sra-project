public void nonRecInOrder(BinaryTree.TreeNode p) {
    java.util.Stack<BinaryTree.TreeNode> stack = new java.util.Stack<>();
    BinaryTree.TreeNode node = p;
    while ((node != null) || ((stack.size()) > 0)) {
        while (node != null) {
            stack.push(node);
            node = node.leftChild;
        } 
        while ((stack.size()) > 0) {
            node = stack.pop();
            visted(node);
            node = node.rightChild;
        } 
    } 
}