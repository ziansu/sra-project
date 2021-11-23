public boolean gameOver(Player player) {
    return (player.didWeWin(this)) || (player.didWeLose(this));
}