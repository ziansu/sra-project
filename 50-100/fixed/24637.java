@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    if ((mEvents.size()) == 0) {
        emptyView.setVisibility(View.VISIBLE);
        emptyView.setText(R.string.time_line_refresh_failed);
    }
    if (((error.getResponse()) != null) && ((error.getResponse().getStatus()) == 422)) {
        isEnd = true;
    }
    isGettingMore = false;
    mHandler.removeCallbacks(mProgressRunnable);
    mSwipeRefreshLayout.setRefreshing(false);
}