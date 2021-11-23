@java.lang.Override
public void run() {
    if ((mDrawerListView) != null) {
        mDrawerListView.setItemChecked(mCurrentSelectedPosition, true);
    }
    if ((mCallbacks) != null) {
        mCallbacks.onNavigationDrawerItemSelected(mCurrentSelectedPosition);
    }
}