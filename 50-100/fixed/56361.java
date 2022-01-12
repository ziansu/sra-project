@java.lang.Override
public void onBackPressed() {
    if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
        mDrawerLayout.closeDrawer(GravityCompat.START);
    }else
        if ((fm.getBackStackEntryCount()) > 0) {
            fm.popBackStack();
        }else {
            super.onBackPressed();
        }
    
}