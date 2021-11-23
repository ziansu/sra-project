private AVLTree.Node<T> max(AVLTree.Node<T> current) {
    if ((current.getRight()) == null)
        return current;
    
    return max(current.getRight());
}