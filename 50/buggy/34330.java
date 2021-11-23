public void movePlayer(cluedo.Player player, cluedo.Position oldPos, cluedo.Position newPos) {
    frame.movePlayer(player, oldPos, newPos);
    board.move(oldPos, newPos);
}