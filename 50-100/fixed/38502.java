public courtree.Node findNode(int key) {
    courtree.Node focusNode = getRoot();
    if (focusNode == null)
        return focusNode;
    
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