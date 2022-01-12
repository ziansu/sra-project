private void showEmpty() {
    mRecyclerView.setVisibility(View.GONE);
    mError.setVisibility(View.GONE);
    mEmpty.setVisibility(View.VISIBLE);
    mRefreshLayout.setRefreshing(false);
}