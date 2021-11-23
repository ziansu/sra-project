public static void start(@android.support.annotation.NonNull
android.app.Activity argActivity, @android.support.annotation.NonNull
org.bottiger.podcast.provider.Subscription argSubscription) {
    if (!(argSubscription.IsLoaded())) {
        org.bottiger.podcast.SoundWaves.getLibraryInstance().loadEpisodes(argSubscription);
    }
    android.os.Bundle b = new android.os.Bundle();
    b.putBoolean(org.bottiger.podcast.activities.feedview.FeedActivity.FEED_ACTIVITY_IS_SLIM, false);
    b.putString(org.bottiger.podcast.activities.feedview.FeedActivity.SUBSCRIPTION_URL_KEY, argSubscription.getURLString());
    org.bottiger.podcast.activities.feedview.FeedActivity.mFuckItHack = null;
    org.bottiger.podcast.activities.feedview.FeedActivity.startActivity(argActivity, b);
}