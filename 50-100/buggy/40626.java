public java.util.List<java.lang.Integer> getFreeColumns() {
    java.util.List<java.lang.Integer> freeColumns = new java.util.ArrayList<java.lang.Integer>();
    for (int i = 0; i < (nCols); i++) {
        if ((this.board[((nRows) - 1)][i]) == (net.etfbl.connectfour.GameBoard.EMPTY))
            freeColumns.add(i);
        
    }
    java.lang.System.out.println(this);
    return freeColumns;
}