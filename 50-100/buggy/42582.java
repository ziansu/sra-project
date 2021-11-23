public void update(com.thefunteam.android.model.Model model) {
    java.util.List<java.lang.String> players = model.getCurrentGame().getPlayers();
    playerList.clear();
    if (players != null) {
        playerList.addAll(players);
        startGameButton.setEnabled((((playerList.size()) > 1) && ((playerList.size()) < 6)));
    }
    adapter.notifyDataSetChanged();
}