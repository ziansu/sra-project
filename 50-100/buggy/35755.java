private void rightRotate(algorithms.trees.RBNode x) {
    algorithms.trees.RBNode y = x.leftChild;
    x.leftChild = y.rightChild;
    if ((y.rightChild) != null) {
        y.rightChild.parent = x;
    }
    y.parent = x.parent;
    if ((x.parent) == null) {
        this.rootNode = y;
    }else
        if (x == (x.parent.rightChild)) {
            x.parent.rightChild = y;
        }else {
            x.parent.leftChild = y;
        }
    
    y.rightChild = x;
    x.parent = y;
}