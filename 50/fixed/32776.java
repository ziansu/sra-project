private void handleMoveEnd(es.ucm.fdi.tp.views.swing.Board board, es.ucm.fdi.tp.views.swing.Piece turn, boolean success) {
    this.board = board;
    this.turn = turn;
    boardComponent.setEnabled(isPieceTurn(turn));
    redrawBoard();
}