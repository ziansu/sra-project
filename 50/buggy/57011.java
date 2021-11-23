@java.lang.Override
public void onRefresh() {
    mSwipeRefreshLayout.setRefreshing(false);
    mOrganizationListPresenter.onRefresh();
}