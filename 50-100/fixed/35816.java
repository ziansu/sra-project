public static void startSlim(@android.support.annotation.NonNull
android.app.Activity argActivity, @android.support.annotation.NonNull
java.lang.String argURL, @android.support.annotation.Nullable
org.bottiger.podcast.provider.SlimImplementations.SlimSubscription argSubscription) {
    android.os.Bundle b = new android.os.Bundle();
    android.content.Intent intent = new android.content.Intent(argActivity, org.bottiger.podcast.activities.discovery.DiscoveryFeedActivity.class);
    b.putBoolean(org.bottiger.podcast.activities.feedview.FeedActivity.FEED_ACTIVITY_IS_SLIM, true);
    b.putString(org.bottiger.podcast.activities.feedview.FeedActivity.SUBSCRIPTION_URL_KEY, argURL);
    b.putParcelable(org.bottiger.podcast.activities.feedview.FeedActivity.SUBSCRIPTION_SLIM_KEY, argSubscription);
    intent.putExtras(b);
    argActivity.startActivity(intent);
    argActivity.overridePendingTransition(R.anim.slide_in_bottom, R.anim.slide_out_bottom);
}