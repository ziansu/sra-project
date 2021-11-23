private BSTreeNode<T> add(BSTreeNode<T> curr, BSTreeNode<T> t) {
    if (curr == null) {
        return t;
    }else
        if ((t.getData().compareTo(curr.getData())) < 0) {
            curr.setLeft(add(curr.getLeft(), t));
        }else {
            curr.setRight(add(curr.getRight(), t));
        }
    
    return curr;
}