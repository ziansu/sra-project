public void movePlayer(java.lang.String username, double x, double y, int dir) {
    players.get(getPlayerMPIndex(username)).setX(x);
    players.get(getPlayerMPIndex(username)).setY(y);
    players.get(getPlayerMPIndex(username)).setAnim(dir);
    players.get(getPlayerMPIndex(username)).setWalking(true);
}