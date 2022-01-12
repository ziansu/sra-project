@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    mVoteView.initializeVoteSwipeRefreshLayout();
    mVoteView.initializeVoteNetworkingErrorImageView();
    mVoteView.hideVoteSwipeRefreshLayout();
    mVoteView.hideVoteCardView();
    mVoteView.hideNetworkingErrorImageView();
    if (savedInstanceState == null) {
        mVoteView.showVoteProgressBar();
        pullVoteStoryFromNetwork();
    }else {
        restoreInstanceState(savedInstanceState);
        pullVoteStoryFromCache();
    }
}