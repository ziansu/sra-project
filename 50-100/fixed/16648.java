private void initview() {
    mTitle.setText("评论记录");
    initRefresh();
    mRecyclerview.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));
    com.grandmagic.readingmate.adapter.MultiItemTypeAdapter mInnerAdapter = new com.grandmagic.readingmate.adapter.MultiItemTypeAdapter(this, mStrings);
    mInnerAdapter.addItemViewDelegate(new com.grandmagic.readingmate.adapter.NotificationCommentDelagte(this)).addItemViewDelegate(new com.grandmagic.readingmate.adapter.NotificationThumbDelagte(this));
    mAdapter = new com.grandmagic.readingmate.adapter.DefaultEmptyAdapter(mInnerAdapter, this);
    mRecyclerview.setAdapter(mAdapter);
}