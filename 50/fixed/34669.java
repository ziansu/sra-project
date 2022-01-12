@java.lang.Override
public void onBackPressed() {
    if (((mDrawer) != null) && (mDrawer.isDrawerOpen(GravityCompat.START))) {
        mDrawer.closeDrawer(GravityCompat.START);
    }else {
        super.onBackPressed();
    }
}