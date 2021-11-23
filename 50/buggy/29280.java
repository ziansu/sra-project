@java.lang.Override
public void onPrepareLayout() {
    mRecyclerView.setHasFixedSize(true);
    android.support.v7.widget.RecyclerView.LayoutManager layoutManager = new android.support.v7.widget.LinearLayoutManager(getActivity());
    mRecyclerView.setLayoutManager(layoutManager);
    mRecyclerView.setNestedScrollingEnabled(false);
    getPresenter().getData(boxes);
}