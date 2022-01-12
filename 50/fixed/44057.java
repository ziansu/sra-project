public void add(T newToSearch) {
    if ((newToSearch.toSearch()) != null) {
        mRBTree.insert(newToSearch.key(), newToSearch);
    }
}