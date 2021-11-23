private void initViews() {
    mRefresh = ((android.support.v4.widget.SwipeRefreshLayout) (findViewById(R.id.swiperefresh)));
    mRefresh.setOnRefreshListener(new android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener() {
        @java.lang.Override
        public void onRefresh() {
            android.util.Log.i("Journee", "onRefresh called from SwipeRefreshLayout");
            refreshListView(false);
        }
    });
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.my_recycler_view)));
    mRecyclerView.setHasFixedSize(true);
}