private void initSwipeToRefreshHelper(android.view.View view) {
    mSwipeToRefreshHelper = new org.wordpress.android.util.helpers.SwipeToRefreshHelper(getActivity(), ((org.wordpress.android.util.widgets.CustomSwipeRefreshLayout) (view.findViewById(R.id.ptr_layout))), new org.wordpress.android.util.helpers.SwipeToRefreshHelper.RefreshListener() {
        @java.lang.Override
        public void onRefreshStarted() {
            if (!(isAdded())) {
                return ;
            }
            if (!(org.wordpress.android.util.NetworkUtils.checkConnection(getActivity()))) {
                setRefreshing(false);
                updateEmptyView(EmptyViewMessageType.NETWORK_ERROR);
                return ;
            }
            requestPosts(false);
        }
    });
}