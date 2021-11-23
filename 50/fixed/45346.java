@java.lang.Override
protected void setupCommonUIDelegate(@android.support.annotation.NonNull
com.playground.notification.app.activities.CommonUIDelegate commonUIDelegate) {
    super.setupCommonUIDelegate(commonUIDelegate);
    commonUIDelegate.setDrawerLayout(mBinding.drawerLayout);
    commonUIDelegate.setNavigationView(mBinding.navView);
    commonUIDelegate.setAppListView(mBinding.appListFl);
}