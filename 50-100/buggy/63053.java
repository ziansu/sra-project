protected void printBoard() {
    for (timdevries.gamesuite350.BoardSquare[] b : board) {
        for (timdevries.gamesuite350.BoardSquare bs : b) {
            java.lang.System.out.print(((bs.getPiece().getColor().toString()) + " "));
        }
        java.lang.System.out.print("\n");
    }
}