@java.lang.Override
public void onRefresh() {
    mAdapter.isRefreshing = true;
    action.onAction();
}