@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    mHotView.initializeHotSwipeRefreshLayout();
    mHotView.initializeHotNetworkingErrorImageView();
    mHotView.initializeHotRecyclerView();
    mHotView.hideHotSwipeRefreshLayout();
    mHotView.hideNetworkingErrorImageView();
    if (savedInstanceState == null) {
        mHotView.showHotProgressBar();
        initializeInstanceState();
        pullHotAnthologyFromNetwork();
    }else {
        restoreInstanceState(savedInstanceState);
        pullHotAnthologyFromCache();
    }
}