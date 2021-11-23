public void play(remixlab.bias.event.ClickEvent event) {
    if ((piece) != null) {
        piece.move(x, y, move);
        piece = null;
    }
    Board.resetMoves();
}