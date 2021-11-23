private void init() {
    swipeRefresh = ((android.support.v4.widget.SwipeRefreshLayout) (getActivity().findViewById(R.id.swipe_refresh)));
    swipeRefresh.setColorSchemeResources(R.color.colorPrimary);
    setupConnection();
}