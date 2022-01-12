public void setStats(java.lang.String username, int played, int won, int draws) {
    usernameLabel.setText(username);
    oponentLabel.setText("");
    gamesPlayed.setText(("Played: " + played));
    gamesWon.setText(("Won: " + won));
    drawGames.setText(("Draws: " + draws));
}