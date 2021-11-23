private void updateScoresAfterMove() {
    java.util.ArrayList<javafx_ui.gamePane.PlayerData> players = m_GameInfo.getPlayers();
    for (int i = 0; i < (m_GameInfo.getNumOfPlayers()); i++) {
        m_PlayersController.getScoreLabels()[i].setText(java.lang.String.valueOf(players.get(i).getScore()));
        updateCurrPlayer();
    }
}