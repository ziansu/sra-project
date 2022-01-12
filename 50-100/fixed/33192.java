@java.lang.Override
public com.example.raqib.instadate.MyNewsRecyclerViewAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    context = parent.getContext();
    android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_item, parent, false);
    return new com.example.raqib.instadate.MyNewsRecyclerViewAdapter.ViewHolder(view);
}