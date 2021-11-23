@java.lang.Override
public void onRefresh() {
    mAdapter.notifyDataSetChanged();
    mSwipeLayout.setRefreshing(false);
}