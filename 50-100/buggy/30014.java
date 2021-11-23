@java.lang.Override
protected void onResume() {
    super.onResume();
    if (isOnCreate) {
        isOnCreate = false;
        return ;
    }
    updaterPlayerList();
    teamfmg.hangman.MultiplayerWifiLobby.multiplayerGame.setGameState(MultiplayerGame.GameState.CREATING);
    db.updateOnlineGame(teamfmg.hangman.MultiplayerWifiLobby.multiplayerGame);
    startButton.setText("Search for Players");
    if (db.onlineGameIsFree(teamfmg.hangman.MultiplayerWifiLobby.multiplayerGame.getId())) {
        db.createOnlineGamePlayer(teamfmg.hangman.MultiplayerWifiLobby.onlineGamePlayer);
    }else {
        this.finish();
    }
}