public void setLeftChild(RBElement leftChild) {
    this.leftChild = leftChild;
    if (this.hasLeftChild()) {
        leftChild.setParent(this);
    }
}