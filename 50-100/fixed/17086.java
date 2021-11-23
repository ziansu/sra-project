@java.lang.Override
public void onBackPressed() {
    if (((mDrawerLayout) != null) && (mDrawerLayout.isDrawerOpen(GravityCompat.START))) {
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return ;
    }
    if (mCompoundSearchBox.isVisible()) {
        onBackArrowClick();
        return ;
    }
    if ((mGoingAndReturnLayout.getVisibility()) == (android.view.View.VISIBLE)) {
        mGoingAndReturnLayout.setVisibility(View.GONE);
        mToolbar.setVisibility(View.VISIBLE);
        mMyBusMap.cleanMap();
        return ;
    }
    finish();
}