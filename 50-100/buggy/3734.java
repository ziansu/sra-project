@java.lang.Override
protected void initView(android.view.View view, android.os.Bundle savedInstanceState) {
    mActivity.mProgressBar.setVisibility(View.VISIBLE);
    android.support.v7.widget.LinearLayoutManager layoutManager = new android.support.v7.widget.LinearLayoutManager(mActivity);
    layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
    recyclerView.setLayoutManager(layoutManager);
    recyclerView.setHasFixedSize(true);
    recyclerView.addItemDecoration(new com.clem.nhkradio.view.DividerItemDecoration(getActivity(), com.clem.nhkradio.view.DividerItemDecoration.VERTICAL_LIST));
}