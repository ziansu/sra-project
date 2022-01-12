@java.lang.Override
public void onPlacesList(final java.lang.String nextPageToken, java.util.List<com.globalfriends.com.aroundme.data.places.PlaceInfo> placeList) {
    if (((mProgress) != null) && (mProgress.isShowing())) {
        mProgress.dismiss();
    }
    if ((mSwipeRefresh) != null) {
        mSwipeRefresh.setRefreshing(false);
    }
    if ((mAdapter) != null) {
        mAdapter.swapItem(placeList);
    }
    mNextPageToken = nextPageToken;
}