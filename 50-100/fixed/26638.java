@java.lang.Override
public com.android.summer.csula.foodvoter.RVoteAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.content.Context context = parent.getContext();
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(context);
    android.view.View view = inflater.inflate(R.layout.list_item, parent, false);
    return new com.android.summer.csula.foodvoter.RVoteAdapter.ViewHolder(view);
}