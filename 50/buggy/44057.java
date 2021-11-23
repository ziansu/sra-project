public void add(T newToSearch) {
    if ((newToSearch.toSearch()) != null) {
        com.mozz.search.balancetree.RBTreeNode<T> node = new com.mozz.search.balancetree.RBTreeNode<T>(newToSearch);
        mRBTree.insert(node);
    }
}