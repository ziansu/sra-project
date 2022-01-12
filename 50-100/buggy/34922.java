@java.lang.Override
public void run() {
    if (page == 1) {
        mRecyclerViewAdapter.getDataList().clear();
    }else {
    }
    mCount = page;
    mRecyclerViewAdapter.getDataList().addAll(setList());
    mRecyclerViewAdapter.notifyDataSetChanged();
    mPullLoadMoreRecyclerView.setPullLoadMoreCompleted();
}