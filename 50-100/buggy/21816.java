@java.lang.Override
public void onBindViewHolder(group8.matchtracker.adapters.PlayerListAdapter.ViewHolder holder, int position) {
    group8.matchtracker.data.Player currentPlayer = group8.matchtracker.adapters.PlayerListAdapter.mPlayers.get(position);
    holder.mPlayerId = currentPlayer.getId();
    holder.mNameTextView.setText(currentPlayer.getName());
    holder.mIgnTextView.setText(currentPlayer.getIgn());
}