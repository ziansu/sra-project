public static java.lang.Character charWithName(java.lang.Character[][] board, java.lang.String name) {
    for (int i = 0; i < (board.length); ++i) {
        for (int j = 0; j < (board[i].length); ++j) {
            if (board[i][j].getName().equals(name.trim())) {
                return board[i][j];
            }
        }
    }
    return null;
}