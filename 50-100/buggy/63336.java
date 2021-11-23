public void setPiece(int row, int column, net.etfbl.connectfour.Game.Player player) {
    java.lang.System.out.println(((("Inserting piece " + player) + "; ordinal: ") + ((java.lang.Integer) (player.ordinal()))));
    if (((row != (net.etfbl.connectfour.GameBoard.COLUMN_FULL)) && (column >= 0)) && (column < (this.nCols))) {
        this.board[row][column] = ((java.lang.Integer) (player.ordinal()));
    }
}