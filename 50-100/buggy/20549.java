public void insertNode(int data, Node recursiveNode) {
    Node node = new Node(data);
    if (isEmpty()) {
        recursiveNode = node;
    }else
        if ((node.data) < (recursiveNode.data)) {
            if ((recursiveNode.left) == null)
                recursiveNode = node;
            else
                insertNode(node.data, recursiveNode.left);
            
        }else {
            if ((recursiveNode.right) == null)
                recursiveNode = node;
            else
                insertNode(node.data, recursiveNode.right);
            
        }
    
}