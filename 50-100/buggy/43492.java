@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    mVoteView.initializeVoteSwipeRefreshLayout();
    mVoteView.initializeVoteNetworkingErrorImageView();
    mVoteView.hideVoteSwipeRefreshLayout();
    mVoteView.hideVoteCardView();
    mVoteView.showVoteProgressBar();
    mVoteView.hideNetworkingErrorImageView();
    if (savedInstanceState == null) {
        pullVoteStoryFromNetwork();
    }else {
        restoreInstanceState(savedInstanceState);
        pullVoteStoryFromCache();
    }
}