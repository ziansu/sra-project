public boolean isLeaf() {
    return (!(this.hasLeftChild())) && (!(this.hasRightChild()));
}