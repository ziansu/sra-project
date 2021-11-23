private void setListeners() {
    mSwipeRefreshLayout.setOnRefreshListener(new android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener() {
        @java.lang.Override
        public void onRefresh() {
            mAdapter.clear();
            mAdapter.addAll(mProducts);
            fetchData();
            mSwipeRefreshLayout.setRefreshing(false);
        }
    });
    mSwipeRefreshLayout.setColorSchemeResources(android.R.color.holo_blue_bright, android.R.color.holo_green_light, android.R.color.holo_orange_light, android.R.color.holo_red_light);
}