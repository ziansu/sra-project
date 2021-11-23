@java.lang.Override
public void onRefresh() {
    mAdapter.notifyDataSetChanged();
    mRecyclerView.setAdapter(mAdapter);
    mSwipeLayout.setRefreshing(false);
}