public void updateUI() {
    for (int i = 0; i < (boardSize); i++) {
        for (int j = 0; j < (boardSize); j++) {
            squares[i][j].setBackground(board.getPiece(i, j));
            java.lang.System.out.println(board.getPiece(i, j));
        }
    }
    java.lang.System.out.println("Updated!");
}