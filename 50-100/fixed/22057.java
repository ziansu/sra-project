public void updateUI() {
    for (int i = 0; i < (boardSize); i++) {
        for (int j = 0; j < (boardSize); j++) {
            squares[j][i].setBackground(board.getPiece(j, i));
        }
    }
    java.lang.System.out.println("Updated!");
}