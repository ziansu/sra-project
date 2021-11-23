@java.lang.Override
public void onRefresh() {
    mDataAdapter.clear();
    mLRecyclerViewAdapter.notifyDataSetChanged();
    com.lzx.demo.ui.SwipeDeleteActivity.mCurrentCounter = 0;
    isRefresh = true;
    requestData();
}