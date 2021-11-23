private void selectItem(int position) {
    mCurrentSelectedPosition = position;
    if ((mDrawerListView) != null) {
        mDrawerListView.setItemChecked(position, true);
    }
    if ((mCallbacks) != null) {
        if (mCallbacks.onNavigationDrawerItemSelected(position)) {
            try {
                mAdapter.setSelectedPosition(position);
            } catch (java.lang.Exception e) {
            }
        }
    }
}