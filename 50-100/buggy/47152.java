@java.lang.Override
protected void onStart() {
    super.onStart();
    de.greenrobot.event.EventBus.getDefault().registerSticky(this);
    if ((!(org.wordpress.android.ui.prefs.AppPrefs.isNotificationsSwipeToNavigateShown())) && ((mAdapter.getCount()) > 1)) {
        org.wordpress.android.widgets.WPSwipeSnackbar.show(mViewPager);
    }
}