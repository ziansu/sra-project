protected boolean isValidItemIndex(int index) {
    return (((mViewAdapter) != null) && ((mViewAdapter.getItemsCount()) > 0)) && (((mIsCyclic) || (index >= 0)) && (index < (mViewAdapter.getItemsCount())));
}