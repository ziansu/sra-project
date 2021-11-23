@butterknife.OnClick(value = R.id.fabComposeTweet)
public void startComposeTweetFragment() {
    if (!(isOnline())) {
        android.widget.Toast.makeText(this, "Please connect to the Internet", Toast.LENGTH_SHORT).show();
        return ;
    }
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    com.codepath.apps.tweettrove.fragments.ComposeTweetFragment composeTweetFragment = com.codepath.apps.tweettrove.fragments.ComposeTweetFragment.newInstance();
    composeTweetFragment.show(fm, "compose_tweet_fragment");
}