@java.lang.Override
public void onNavigationDrawerItemSelected(int position) {
    if (position == (mCurrentSelectedPosition)) {
        closeDrawer();
        return ;
    }
    closeDrawer();
    mCurrentSelectedPosition = position;
    if ((mCallbacks) != null) {
        mCallbacks.onNavigationDrawerItemSelected(position);
    }
}