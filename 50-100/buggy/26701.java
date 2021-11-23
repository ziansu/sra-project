private void initAdapter() {
    mQuickAdapter = new com.chad.baserecyclerviewadapterhelper.adapter.QuickAdapter(this, com.chad.baserecyclerviewadapterhelper.HeaderAndFooterUseActivity.PAGE_SIZE);
    mQuickAdapter.openLoadAnimation();
    mRecyclerView.setAdapter(mQuickAdapter);
    mQuickAdapter.setOnRecyclerViewItemClickListener(new com.chad.library.adapter.base.BaseQuickAdapter.OnRecyclerViewItemClickListener() {
        @java.lang.Override
        public void onItemClick(android.view.View view, int position) {
            android.widget.Toast.makeText(com.chad.baserecyclerviewadapterhelper.HeaderAndFooterUseActivity.this, ("" + (java.lang.Integer.toString(position))), Toast.LENGTH_LONG).show();
        }
    });
}