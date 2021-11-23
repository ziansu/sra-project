@java.lang.Override
protected void onFinishInflate() {
    super.onFinishInflate();
    mDrawerContainer = new rikka.minidrawer.DrawerContainer(getContext());
    mDrawerContainer.init(mMenuResourceId, mDrawerWidthMini, mDrawerWidthExpanded, mDrawerPadding);
    mDrawerContainer.setNavigationItemSelectedListener(new android.support.design.widget.NavigationView.OnNavigationItemSelectedListener() {
        @java.lang.Override
        public boolean onNavigationItemSelected(android.view.MenuItem item) {
            if ((mNavigationItemSelectedListener) != null) {
                mNavigationItemSelectedListener.onNavigationItemSelected(item);
            }
            return false;
        }
    });
    addView(mDrawerContainer);
    setExpanded(false);
}