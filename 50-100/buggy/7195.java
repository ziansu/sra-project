public void updateBoardContent(char[][] board) {
    for (int i = 0; i < (boardContent.length); i++) {
        for (int j = 0; j < (boardContent[0].length); j++) {
            boardContent[i][j] = board[i][j];
        }
    }
}