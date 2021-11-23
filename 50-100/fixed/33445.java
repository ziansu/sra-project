@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    appBarLayout = ((android.support.design.widget.AppBarLayout) (busStopsActivity.findViewById(R.id.appbar)));
    setupRecyclerView();
    setupSwipeRefreshLayout();
    mSwipeRefreshLayout.setRefreshing(true);
    updateBusTimes();
}