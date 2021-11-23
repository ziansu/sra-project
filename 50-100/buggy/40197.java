@butterknife.OnClick(value = R.id.ibMessageDetails)
public void putReply() {
    android.content.Intent i = new android.content.Intent(com.codepath.apps.tweetter.TweetAdapter.context, com.codepath.apps.tweetter.ReplyActivity.class);
    i.putExtra(com.codepath.apps.tweetter.models.Tweet.class.getSimpleName(), org.parceler.Parcels.wrap(tweet));
    ((android.support.v7.app.AppCompatActivity) (com.codepath.apps.tweetter.TweetAdapter.context)).startActivityForResult(i, com.codepath.apps.tweetter.TimelineActivity.REQUEST_CODE_REPLY);
}