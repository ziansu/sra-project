@java.lang.Override
public void onPlacesList(final java.lang.String nextPageToken, java.util.List<com.globalfriends.com.aroundme.data.places.PlaceInfo> placeList) {
    mAdapter.swapItem(placeList);
    if (mProgress.isShowing()) {
        mProgress.dismiss();
    }
    if ((mSwipeRefresh) != null) {
        mSwipeRefresh.setRefreshing(false);
    }
    mNextPageToken = nextPageToken;
}