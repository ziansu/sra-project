private void updatePlayers() {
    parent = ((android.widget.LinearLayout) (findViewById(R.id.mpWifiLobby_scrollView)));
    parent.removeAllViews();
    count = 0;
    java.util.List<teamfmg.hangman.OnlineGamePlayer> onlineGamePlayers = db.getAllMultiplayergamePlayers(teamfmg.hangman.MultiplayerWifiLobby.multiplayerGame.getId());
    for (int i = 0; i < (onlineGamePlayers.size()); i++) {
        addInclude(onlineGamePlayers.get(i));
    }
}