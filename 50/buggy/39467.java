public void setLeftChild(RBElement leftChild) {
    this.leftChild = leftChild;
    if (hasLeftChild()) {
        leftChild.setParent(this);
    }
}