@java.lang.Override
public boolean areAllItemsEnabled() {
    return ((mAdapter) == null) || ((mAreAllFixedViewsSelectable) && (mAdapter.areAllItemsEnabled()));
}