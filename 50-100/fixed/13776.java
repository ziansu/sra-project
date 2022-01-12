@java.lang.Override
public void onClick(android.view.View v) {
    if (mDrawerLayout.isDrawerOpen(Gravity.RIGHT)) {
        mDrawerLayout.closeDrawer(Gravity.RIGHT);
    }
    if (mDrawerLayout.isDrawerOpen(Gravity.LEFT)) {
        mDrawerLayout.closeDrawer(Gravity.LEFT);
    }else {
        if ((getCurrentFragmentManager().getBackStackEntryCount()) == 0) {
            mDrawerLayout.openDrawer(Gravity.LEFT);
        }
    }
}