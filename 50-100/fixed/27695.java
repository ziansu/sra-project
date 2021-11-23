public boolean setSelectionAtPosition(int position, boolean fireOnClick) {
    if ((mDrawerBuilder.mRecyclerView) != null) {
        mDrawerBuilder.mAdapter.deselect();
        mDrawerBuilder.mAdapter.select(position, false);
        if ((((mDrawerBuilder.mOnDrawerItemClickListener) != null) && fireOnClick) && (position >= 0)) {
            mDrawerBuilder.mOnDrawerItemClickListener.onItemClick(null, position, mDrawerBuilder.mAdapter.getItem(position));
        }
    }
    return false;
}