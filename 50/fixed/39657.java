@java.lang.Override
public void hideLoading() {
    com.zoctan.solar.utils.LogUtils.d(TAG, "hide loading");
    mSwipeRefreshWidget.setRefreshing(false);
}