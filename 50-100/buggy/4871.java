private BSTreeNode<T> add(BSTreeNode<T> curr, BSTreeNode<T> t) {
    if (curr == null) {
        return t;
    }else
        if ((t.getData().compareTo(curr.getData())) < 0) {
            curr.setLeft(add(root.getLeft(), t));
            return curr;
        }else {
            curr.setRight(add(root.getRight(), t));
            return curr;
        }
    
}