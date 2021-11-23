@java.lang.Override
public void showMoreContent(java.lang.String date, com.codeest.geeknews.model.bean.DailyBeforeListBean info) {
    if (swipeRefresh.isRefreshing()) {
        swipeRefresh.setRefreshing(false);
    }else {
        viewLoading.stop();
    }
    mPresenter.stopInterval();
    mList = info.getStories();
    currentDate = java.lang.String.valueOf(java.lang.Integer.valueOf(info.getDate()));
    viewLoading.stop();
    mAdapter.addDailyBeforeDate(info);
}