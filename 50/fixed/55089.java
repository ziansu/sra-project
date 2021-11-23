@java.lang.Override
public void run() {
    if ((mDrawerListView) != null) {
        mDrawerListView.setItemChecked(position, true);
    }
    if ((mCallbacks) != null) {
        mCallbacks.onNavigationDrawerItemSelected(position);
    }
}