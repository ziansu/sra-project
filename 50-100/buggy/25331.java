private void setRefreshListener() {
    mSwipeRefreshLayout.setColorSchemeResources(android.R.color.holo_blue_light, android.R.color.holo_purple, android.R.color.holo_orange_light, android.R.color.holo_green_light, android.R.color.transparent);
    mSwipeRefreshLayout.setProgressBackgroundColorSchemeColor(getResources().getColor(R.color.new_orange));
    mSwipeRefreshLayout.setSize((-1));
    mSwipeRefreshLayout.setOnRefreshListener(mSwipeRefreshLayoutOnRefreshListener);
}