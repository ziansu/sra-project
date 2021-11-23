@java.lang.Override
public void run() {
    mSwipeRefreshLayout.setRefreshing(true);
    mPresenter.loadForecast(mLocationModel, false);
}