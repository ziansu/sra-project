private void initRecyclerView() {
    android.support.v7.widget.LinearLayoutManager linearLayoutManager = new android.support.v7.widget.LinearLayoutManager(getActivity()) {
        @java.lang.Override
        protected int getExtraLayoutSpace(android.support.v7.widget.RecyclerView.State state) {
            return 300;
        }
    };
    mRecyclerView.setLayoutManager(linearLayoutManager);
    mNewsListAdapter.bindFragment(this);
    mRecyclerView.setAdapter(mNewsListAdapter);
    mRecyclerView.setItemAnimator(new com.lixinwei.www.goldennews.newslist.NewsItemAnimator());
}