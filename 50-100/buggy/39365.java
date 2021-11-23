private void selectItem(int position) {
    mCurrentSelectedPosition = position;
    if ((mDrawerListView) != null) {
        mDrawerListView.setItemChecked(position, true);
    }
    if ((mDrawerLayout) != null) {
        mDrawerLayout.closeDrawer(mFragmentContainerView);
    }
    if ((mCallbacks) != null) {
        mCallbacks.onNavigationDrawerItemSelected(position);
    }
}