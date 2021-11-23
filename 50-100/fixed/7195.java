public void updateBoardContent(char[][] board) {
    this.boardContent = new char[board.length][board[0].length];
    for (int i = 0; i < (boardContent.length); i++) {
        for (int j = 0; j < (boardContent[0].length); j++) {
            boardContent[i][j] = board[i][j];
        }
    }
}