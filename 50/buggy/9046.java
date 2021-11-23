private int getPlayingPlayerId() {
    return ((getTurn()) - 1) % (hanabi.getPlayerCount());
}