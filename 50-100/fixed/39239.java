private data.structure.tree.NodeRBTree<E> myCloseRedNiece(boolean isLeft, data.structure.tree.NodeRBTree<E> sibling) {
    data.structure.tree.NodeRBTree<E> niece = ((data.structure.tree.NodeRBTree<E>) ((isLeft) ? sibling.getLeftChild() : sibling.getRightChild()));
    return niece.isRed() ? niece : null;
}