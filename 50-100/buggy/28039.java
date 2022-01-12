@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    mHotView.initializeHotSwipeRefreshLayout();
    mHotView.initializeHotNetworkingErrorImageView();
    mHotView.initializeHotRecyclerView();
    mHotView.hideHotSwipeRefreshLayout();
    mHotView.showHotProgressBar();
    mHotView.hideNetworkingErrorImageView();
    if (savedInstanceState == null) {
        initializeInstanceState();
        pullHotAnthologyFromNetwork();
    }else {
        restoreInstanceState(savedInstanceState);
        pullHotAnthologyFromCache();
    }
}