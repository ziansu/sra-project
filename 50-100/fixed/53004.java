@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((org.wordpress.android.ui.notifications.utils.SimperiumUtils.getNotesBucket()) != null) {
        org.wordpress.android.ui.notifications.utils.SimperiumUtils.getNotesBucket().addListener(this);
    }
    mTabLayout.checkNoteBadge();
    trackLastVisibleTab(mViewPager.getCurrentItem());
}