public ds.BNode findNode(int key) {
    ds.BNode focusNode = root;
    if ((root) == null) {
        return null;
    }
    while ((focusNode.getKey()) != key) {
        if (key < (focusNode.getKey())) {
            focusNode = focusNode.getLeftChild();
        }else {
            focusNode = focusNode.getRightChild();
        }
        if (focusNode == null)
            return null;
        
    } 
    return focusNode;
}