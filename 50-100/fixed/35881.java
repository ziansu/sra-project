@java.lang.Override
protected void initView() {
    com.taobao.weex.ui.view.listview.adapter.RecyclerViewBaseAdapter recyclerViewBaseAdapter = new com.taobao.weex.ui.view.listview.adapter.RecyclerViewBaseAdapter(this);
    recyclerViewBaseAdapter.setHasStableIds(true);
    mHost = new com.taobao.weex.ui.view.listview.BounceRecyclerView(mContext);
    getView().getBounceView().setOverScrollMode(View.OVER_SCROLL_NEVER);
    getView().setAdapter(recyclerViewBaseAdapter);
    getView().getBounceView().clearOnScrollListeners();
    getView().getBounceView().addOnScrollListener(new com.taobao.weex.ui.view.listview.adapter.WXRecyclerViewOnScrollListener(this));
}