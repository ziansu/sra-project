@java.lang.Override
public void showLoading() {
    showSwipeRefreshLoading(true);
    mPrayerListView.showLoading();
    if ((mViewFlipper.getDisplayedChild()) != 1) {
        mViewFlipper.setDisplayedChild(0);
    }
}