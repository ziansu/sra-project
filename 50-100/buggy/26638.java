@java.lang.Override
public com.android.summer.csula.foodvoter.RVoteAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view;
    android.content.Context context = parent.getContext();
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(context);
    if (viewType == (EndOfList)) {
        view = inflater.inflate(R.layout.vote_submit_btn, parent, false);
    }else {
        view = inflater.inflate(R.layout.list_item, parent, false);
    }
    com.android.summer.csula.foodvoter.RVoteAdapter.ViewHolder holder = new com.android.summer.csula.foodvoter.RVoteAdapter.ViewHolder(view);
    return holder;
}