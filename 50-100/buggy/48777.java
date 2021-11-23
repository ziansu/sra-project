@java.lang.Override
public void onClick(android.view.View v) {
    final int position = getAdapterPosition();
    if (position != (android.support.v7.widget.RecyclerView.NO_POSITION)) {
        final com.codepath.apps.tweetter.models.Tweet tweet = mTweets.get(position);
        android.content.Intent i = new android.content.Intent(com.codepath.apps.tweetter.TweetAdapter.context, com.codepath.apps.tweetter.ReplyActivity.class);
        i.putExtra(com.codepath.apps.tweetter.models.Tweet.class.getSimpleName(), org.parceler.Parcels.wrap(tweet));
        ((android.support.v7.app.AppCompatActivity) (com.codepath.apps.tweetter.TweetAdapter.context)).startActivityForResult(i, com.codepath.apps.tweetter.TimelineActivity.REQUEST_CODE_REPLY);
    }
}