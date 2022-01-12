@java.lang.Override
public void onRefresh() {
    int requestsCount = mRequests.size();
    mRequests.clear();
    mRequestsAdapter.notifyItemRangeRemoved(0, requestsCount);
    fetchRequests();
    swipeLayoutRequests.setRefreshing(false);
}