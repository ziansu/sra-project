private void updateUI() {
    if (null == (player_)) {
        return ;
    }
    adapter_.notifyDataSetChanged();
    updatePlayButton();
}