public int callMinMax(int[][] board) {
    this.board = board;
    levelPointWithScores = new java.util.ArrayList<com.example.magarwal.tictactoe.PointWithScore>();
    minMax(com.example.magarwal.tictactoe.TicTacToeMinMaxImplementation.computer, 0);
    int max = java.lang.Integer.MIN_VALUE;
    int pos = -1;
    for (com.example.magarwal.tictactoe.PointWithScore p : levelPointWithScores) {
        if (max < (p.score)) {
            max = p.score;
            pos = p.position;
        }
    }
    return pos;
}