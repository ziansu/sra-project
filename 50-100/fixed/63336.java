public void setPiece(int row, int column, net.etfbl.connectfour.Game.Player player) {
    if (((row != (net.etfbl.connectfour.GameBoard.COLUMN_FULL)) && (column >= 0)) && (column < (this.nCols))) {
        this.board[row][column] = ((java.lang.Integer) (player.ordinal()));
    }
}