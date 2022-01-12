@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    switch (viewType) {
        case R.layout.item_movie_detail_header :
            return new me.zsj.interessant.ReplyAdapter.SimpleViewHolder(description);
        default :
            android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.item_reply, parent, false);
            return new me.zsj.interessant.ReplyAdapter.Holder(view);
    }
}