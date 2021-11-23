private void processIntent() {
    android.os.Bundle b = getIntent().getExtras();
    if ((org.bottiger.podcast.activities.feedview.FeedActivity.mFuckItHack) != null)
        b = org.bottiger.podcast.activities.feedview.FeedActivity.mFuckItHack;
    
    boolean isSlim = b.getBoolean(org.bottiger.podcast.activities.feedview.FeedActivity.FEED_ACTIVITY_IS_SLIM);
    java.lang.String url = b.getString(org.bottiger.podcast.activities.feedview.FeedActivity.SUBSCRIPTION_URL_KEY);
    if (isSlim) {
        mSubscription = b.<org.bottiger.podcast.provider.SlimImplementations.SlimSubscription>getParcelable(org.bottiger.podcast.activities.feedview.FeedActivity.SUBSCRIPTION_SLIM_KEY);
        mIsSlimSubscription = true;
    }else {
        mSubscription = org.bottiger.podcast.SoundWaves.getLibraryInstance().getSubscription(url);
        mIsSlimSubscription = false;
    }
}