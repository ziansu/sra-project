@java.lang.Override
public void onClick(android.view.View v) {
    final int position = getAdapterPosition();
    if (position != (android.support.v7.widget.RecyclerView.NO_POSITION)) {
        com.codepath.apps.tweetter.models.Tweet tweet = mTweets.get(position);
        android.content.Intent i = new android.content.Intent(context, com.codepath.apps.tweetter.ProfileActivity.class);
        i.putExtra(com.codepath.apps.tweetter.models.Tweet.class.getSimpleName(), org.parceler.Parcels.wrap(tweet));
        ((android.support.v7.app.AppCompatActivity) (context)).startActivity(i);
    }
}