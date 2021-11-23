@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    setupRecyclerView();
    setupSwipeRefreshLayout();
    mSwipeRefreshLayout.setRefreshing(true);
    updateBusTimes();
    appBarLayout = ((android.support.design.widget.AppBarLayout) (busStopsActivity.findViewById(R.id.appbar)));
}