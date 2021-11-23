@java.lang.Override
public com.codepath.apps.tweetter.TweetAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    context = parent.getContext();
    if ((inflater) == null) {
        inflater = android.view.LayoutInflater.from(context);
    }
    android.view.View tweetView = inflater.inflate(R.layout.item_tweet, parent, false);
    com.codepath.apps.tweetter.TweetAdapter.ViewHolder viewHolder = new com.codepath.apps.tweetter.TweetAdapter.ViewHolder(tweetView);
    return viewHolder;
}