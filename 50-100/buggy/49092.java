protected io.royale7.casino.Player login(int userID, java.lang.String password) throws java.lang.NullPointerException {
    io.royale7.casino.Player loggedInPlayer = playerManager.login(userID, password);
    if (loggedInPlayer != (playerManager.getDefaultPlayer())) {
        loggedInPlayersContainer.add(loggedInPlayer);
        return loggedInPlayer;
    }else {
        return null;
    }
}