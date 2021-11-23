@java.lang.Override
protected void initEvent() {
    mHistoryContactRecyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getActivity()));
    mHistoryContactRecyclerView.setAdapter(mAdapter);
    mSwipeRefreshLayout.setColorSchemeColors(android.support.v4.content.ContextCompat.getColor(getActivity(), R.color.colorPrimary), android.support.v4.content.ContextCompat.getColor(getActivity(), R.color.colorAccent), android.support.v4.content.ContextCompat.getColor(getActivity(), R.color.colorPrimaryDark));
    mSwipeRefreshLayout.setOnRefreshListener(new android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener() {
        @java.lang.Override
        public void onRefresh() {
            mPresenter.loadHistoryContact();
        }
    });
}