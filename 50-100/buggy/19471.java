public void updateBoard(int row, int col, team.abhayumar.connect.Player player) {
    lowestRow = 0;
    for (int i = 0; i < (team.abhayumar.connect.Game.ROWS); i++) {
        if ((board[i][col]) == 0) {
            lowestRow = i;
        }
    }
    board[lowestRow][col] = player.getID();
}