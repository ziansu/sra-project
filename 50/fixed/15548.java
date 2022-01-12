private void handleMoveStart(es.ucm.fdi.tp.views.swing.Board board, es.ucm.fdi.tp.views.swing.Piece turn) {
    this.board = board;
    this.turn = turn;
    boardComponent.setEnabled(false);
}