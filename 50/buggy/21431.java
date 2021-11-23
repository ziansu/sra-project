private kalah.game.board.Player getPlayer(int position) {
    return position <= ((size) + 1) ? Player.PLAYER1 : Player.PLAYER2;
}