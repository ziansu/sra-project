public void movePlayer(cluedo.Player player, cluedo.Position oldPos, cluedo.Position newPos) {
    board.move(oldPos, newPos);
    frame.movePlayer(player, oldPos, newPos);
}