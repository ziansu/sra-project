private void initAdapter() {
    pullToRefreshAdapter = new com.chad.baserecyclerviewadapterhelper.adapter.PullToRefreshAdapter();
    pullToRefreshAdapter.setOnLoadMoreListener(this);
    pullToRefreshAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
    mRecyclerView.setAdapter(pullToRefreshAdapter);
    mCurrentCounter = pullToRefreshAdapter.getData().size();
    mRecyclerView.addOnItemTouchListener(new com.chad.library.adapter.base.listener.OnItemClickListener() {
        @java.lang.Override
        public void onSimpleItemClick(final com.chad.library.adapter.base.BaseQuickAdapter adapter, final android.view.View view, final int position) {
            android.widget.Toast.makeText(com.chad.baserecyclerviewadapterhelper.PullToRefreshUseActivity.this, java.lang.Integer.toString(position), Toast.LENGTH_LONG).show();
        }
    });
}