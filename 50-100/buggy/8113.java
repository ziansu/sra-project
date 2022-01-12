@java.lang.Override
public void onSuccess(java.util.ArrayList<com.givekesh.baboon.Utils.Feeds> result) {
    if (result != null) {
        if ((result.size()) < 10) {
            recyclerView.disableLoadMore();
            isLoadingMore = false;
        }else
            recyclerView.enableLoadMore();
        
        if (isSwipeRefresh) {
            mFeedsArrayList.clear();
            mWaveSwipeRefreshLayout.setRefreshing(false);
        }
        if (isFirstLoad) {
            mFeedsArrayList = result;
            isFirstLoad = false;
        }else
            mFeedsArrayList.addAll(result);
        
        refreshRecycler();
    }
}