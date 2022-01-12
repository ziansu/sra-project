private void singleRotateLeftChild(utils.FlexRedBlackTree<T>.BinaryNode p) {
    rotationCount += 1;
    utils.FlexRedBlackTree<T>.BinaryNode temp = this.leftChild;
    this.leftChild = temp.rightChild;
    temp.rightChild = this;
    if (p == null) {
        root = temp;
    }else {
        if ((c.compare(temp.element, p.element)) < 0) {
            p.leftChild = temp;
        }else {
            p.rightChild = temp;
        }
    }
}