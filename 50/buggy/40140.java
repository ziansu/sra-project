public boolean isLeaf() {
    return (!(hasLeftChild())) && (!(hasRightChild()));
}