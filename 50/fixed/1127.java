public void set(java.util.List viewModels, int viewType) {
    mCollection.clear();
    mCollectionViewType.clear();
    if (viewModels == null) {
        add(null, viewType);
    }else {
        addAll(viewModels, viewType);
    }
}