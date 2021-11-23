public courtree.Node findNode(int key) {
    courtree.Node focusNode = getRoot();
    while ((focusNode.bDate) != key) {
        if (key < (focusNode.bDate)) {
            focusNode = focusNode.leftChild;
        }else {
            focusNode = focusNode.rightChild;
        }
        if (focusNode == null)
            return null;
        
    } 
    return focusNode;
}