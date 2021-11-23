@java.lang.Override
public void hideLoading() {
    com.zoctan.solar.utils.LogUtils.d(TAG, "hide loading");
    mPbLoading.setVisibility(View.GONE);
    mSwipeRefreshWidget.setRefreshing(false);
}