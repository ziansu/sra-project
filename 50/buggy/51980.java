@java.lang.Override
public com.glacial.p0x4.adapters.AddPlayersAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View v = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_new_player, parent, false);
    return new com.glacial.p0x4.adapters.AddPlayersAdapter.ViewHolder(v, game);
}