public java.util.List<T> animateTo(java.util.List<T> models) {
    applyAndAnimateRemovals(mItems, models);
    applyAndAnimateAdditions(mItems, models);
    applyAndAnimateMovedItems(mItems, models);
    return mItems;
}