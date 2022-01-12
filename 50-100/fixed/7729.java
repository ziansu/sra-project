public synchronized boolean removePlayer(CardGame.User user) {
    int removeID = -1;
    int index = 0;
    for (CardGame.GameEngine.Player player : players) {
        if (player.getUsername().equals(user.getUserName())) {
            removeID = index;
        }
        index++;
    }
    if (removeID != (-1)) {
        players.remove(removeID);
        return true;
    }else {
        return false;
    }
}