private void handleChangeTurn(es.ucm.fdi.tp.views.swing.Board board, es.ucm.fdi.tp.views.swing.Piece turn) {
    this.turn = turn;
    boardComponent.setEnabled(isPieceTurn(turn));
    if (turn.equals(WINDOW_OWNER)) {
        WINDOW.toFront();
    }
    requestAutomaticMove();
    redrawBoard();
}