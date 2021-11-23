private void initializeVariables() {
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.recycle_view)));
    mRecyclerView.setHasFixedSize(true);
    android.support.v7.widget.RecyclerView.LayoutManager mLayoutManager = new android.support.v7.widget.LinearLayoutManager(this);
    mRecyclerView.setLayoutManager(mLayoutManager);
    mSwipeRefreshLayout = ((android.support.v4.widget.SwipeRefreshLayout) (findViewById(R.id.swipe_refresh)));
    mSwipeRefreshLayout.setColorSchemeResources(R.color.c1, R.color.c2, R.color.c3, R.color.c4);
    mSwipeRefreshLayout.setOnRefreshListener(new com.example.hectorcastillo.beacon.activists.SponsorSelectionActivity.MyOnRefreshListeners());
    setSponsorAdapter();
}