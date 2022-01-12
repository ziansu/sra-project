public boolean removePlayer(java.lang.String name) {
    for (game.logic.Player p : players) {
        if (p.getUsername().equals(name)) {
            return players.remove(p);
        }
    }
    return false;
}