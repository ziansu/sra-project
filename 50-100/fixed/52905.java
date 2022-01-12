private void initAdapter() {
    mQuickAdapter = new com.chad.baserecyclerviewadapterhelper.adapter.QuickAdapter(0);
    android.view.View emptyView = getLayoutInflater().inflate(R.layout.empty_view, ((android.view.ViewGroup) (mRecyclerView.getParent())), false);
    mQuickAdapter.setEmptyView(emptyView);
    android.view.View view = getLayoutInflater().inflate(R.layout.head_view, ((android.view.ViewGroup) (mRecyclerView.getParent())), false);
    mRecyclerView.setAdapter(mQuickAdapter);
}