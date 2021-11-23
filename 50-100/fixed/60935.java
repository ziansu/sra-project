public void setSelection(int position, boolean fireOnClick) {
    if ((mDrawer.mListView) != null) {
        mDrawer.mListView.setSelection((position + (mDrawer.mHeaderOffset)));
        mDrawer.mListView.setItemChecked((position + (mDrawer.mHeaderOffset)), true);
        if (fireOnClick && ((mDrawer.mOnDrawerItemClickListener) != null)) {
            mDrawer.mOnDrawerItemClickListener.onItemClick(null, null, position, position, mDrawer.getDrawerItem(position, false));
        }
        mDrawer.mCurrentSelection = position;
    }
}