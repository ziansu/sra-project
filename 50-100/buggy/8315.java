public int findNodeNumber(int key) {
    edu.oakland.production.ClassProject.Database.Node focusNode = this.binaryTreeDatabase.getRootNode();
    int nodeCount = 0;
    while ((focusNode.getKey()) != key) {
        if (key < (focusNode.getKey())) {
            focusNode = focusNode.leftChild;
        }else {
            focusNode = focusNode.rightChild;
        }
        if (focusNode == null)
            return -1;
        
        nodeCount++;
    } 
    return nodeCount++;
}