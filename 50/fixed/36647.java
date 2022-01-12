@java.lang.Override
public void onRefresh() {
    swipeRefreshLayout.setRefreshing(true);
    updateData(true, true);
}