@java.lang.Override
protected void paintPiece(java.awt.Graphics g, int i, int j, int x, int y, int size) {
    es.ucm.fdi.tp.basecode.bgame.model.Piece piece = getBoard().getPosition(i, j);
    g.setColor(es.ucm.fdi.tp.views.swing.boardpanel.ConnectNBoard.PIECE_BG_COLOR);
    g.fillRect(x, y, size, size);
    if (piece != null) {
        paintPlayerPiece(g, piece, x, y, size);
    }
}