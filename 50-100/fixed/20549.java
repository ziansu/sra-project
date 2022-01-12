public void insertNode(int data, Node recursiveNode) {
    Node node = new Node(data);
    if ((node.data) < (recursiveNode.data)) {
        if ((recursiveNode.left) == null)
            recursiveNode.left = node;
        else
            insertNode(node.data, recursiveNode.left);
        
    }else {
        if ((recursiveNode.right) == null)
            recursiveNode.right = node;
        else
            insertNode(node.data, recursiveNode.right);
        
    }
}