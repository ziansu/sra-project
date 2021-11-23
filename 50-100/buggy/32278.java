@java.lang.Override
public com.codepath.apps.restclienttemplate.helpers.TweetAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    context = ((android.support.v7.app.AppCompatActivity) (parent.getContext()));
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(context);
    android.view.View tweetView = inflater.inflate(R.layout.item_tweet, parent, false);
    com.codepath.apps.restclienttemplate.helpers.TweetAdapter.ViewHolder viewHolder = new com.codepath.apps.restclienttemplate.helpers.TweetAdapter.ViewHolder(tweetView);
    return viewHolder;
}