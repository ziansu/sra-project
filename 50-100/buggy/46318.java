@java.lang.Override
public com.keshavg.reddit.CommentsAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.comment_row, parent, false);
    makeRandomColorLine(view);
    com.keshavg.reddit.CommentsAdapter.ViewHolder viewHolder = new com.keshavg.reddit.CommentsAdapter.ViewHolder(view);
    return viewHolder;
}