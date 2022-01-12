@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    de.greenrobot.event.EventBus.getDefault().postSticky(mVenue);
    outState.putSerializable("lastVenue", mVenue);
    outState.putSerializable("venueFeatures", mVenue.getFeatures());
    outState.putInt(com.example.gerardogtn.partyrock.ui.activity.DetailActivity.SCROLL_X, mNestedScrollView.getScrollX());
    outState.putInt(com.example.gerardogtn.partyrock.ui.activity.DetailActivity.SCROLL_Y, mNestedScrollView.getScrollY());
    if ((mAddress) != null) {
        outState.putString("address", mAddress);
    }
    super.onSaveInstanceState(outState);
}