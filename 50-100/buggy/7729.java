public synchronized void removePlayer(CardGame.User user) {
    int removeID = 999;
    int index = 0;
    for (CardGame.GameEngine.Player player : players) {
        if (player.getUsername().equals(user.getUserName())) {
            removeID = index;
        }
        index++;
    }
    players.remove(removeID);
}