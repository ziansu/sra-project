public void setStats(java.lang.String username, int played, int won, int draws) {
    usernameLabel.setText(username);
    oponentLabel.setText("");
    gamesPlayed.setText(("" + played));
    gamesWon.setText(("" + won));
    drawGames.setText(("" + draws));
}