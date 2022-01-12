@java.lang.Override
public void run() {
    mSwipe.setRefreshing(true);
    if ((mTimeLineAdapter) != null) {
        requestNewTweets(mTimeLineAdapter.getFirstTweet());
    }else {
        mSwipe.setRefreshing(false);
    }
}