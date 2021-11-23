@java.lang.Override
public boolean areAllItemsEnabled() {
    if ((mAdapter) != null) {
        return (mAreAllFixedViewsSelectable) && (mAdapter.areAllItemsEnabled());
    }else {
        return true;
    }
}