@java.lang.Override
public void onBindViewHolder(final io.github.sdsstudios.ScoreKeeper.PlayerListAdapter.ViewHolder holder, int position) {
    holder.textViewPlayer.setText(mDataset.get(position));
    holder.buttonDelete.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            removeAt(holder.getAdapterPosition());
        }
    });
}