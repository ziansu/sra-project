@java.lang.Override
public io.caly.calyandroid.Adapter.RecommandListAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recolist_row, parent, false);
    io.caly.calyandroid.Adapter.RecommandListAdapter.ViewHolder holder = new io.caly.calyandroid.Adapter.RecommandListAdapter.ViewHolder(view);
    com.squareup.picasso.Picasso.with(parent.getContext()).load(R.drawable.sample_food_1).into(holder.imvFood);
    return holder;
}