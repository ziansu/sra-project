@java.lang.Override
public void onBackPressed() {
    if (mDrawerLayout.isDrawerOpen(mDrawerListView)) {
        mDrawerLayout.closeDrawer(mDrawerListView);
        return ;
    }
    fragmentMediator.backPressWebView();
    edu.rutgers.css.Rutgers.utils.LogUtils.LOGV(edu.rutgers.css.Rutgers.ui.MainActivity.TAG, ("Back button pressed. Leaving top component: " + (edu.rutgers.css.Rutgers.utils.AppUtils.topHandle(this))));
    super.onBackPressed();
}