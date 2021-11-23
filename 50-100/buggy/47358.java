@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    if (viewType == (VIEW_TYPE_CONTENT)) {
        return new com.akexorcist.sleepingforless.view.feed.FeedViewHolder(android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.view_feed_item, parent, false));
    }else
        if (viewType == (VIEW_TYPE_LOADING)) {
            return new com.akexorcist.sleepingforless.view.feed.LoadingViewHolder(android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.view_feed_loading, parent, false));
        }
    
    return null;
}