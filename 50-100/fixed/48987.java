private void initRecyclerView() {
    com.qhiehome.ihome.view.RecyclerViewEmptySupport rv = ((com.qhiehome.ihome.view.RecyclerViewEmptySupport) (findViewById(R.id.rv_publish)));
    android.widget.TextView tvListEmpty = ((android.widget.TextView) (findViewById(R.id.tv_publish_empty)));
    rv.setEmptyView(tvListEmpty);
    rv.setHasFixedSize(true);
    rv.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));
    rv.addItemDecoration(new android.support.v7.widget.DividerItemDecoration(this, android.support.v7.widget.DividerItemDecoration.VERTICAL));
    mPublishAdapter = new com.qhiehome.ihome.adapter.PublishParkingAdapter(this, mPublishList);
    initListener(rv);
    rv.setAdapter(mPublishAdapter);
}