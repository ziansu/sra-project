public int callMinMax(int[][] board) {
    this.board = board;
    levelPointWithScores = new java.util.ArrayList<com.example.magarwal.tictactoe.PointWithScore>();
    minMax(com.example.magarwal.tictactoe.TicTacToeMinMaxImplementation.computer, 0);
    int max = java.lang.Integer.MIN_VALUE;
    int pos = -1;
    for (com.example.magarwal.tictactoe.PointWithScore p : levelPointWithScores) {
        java.lang.System.out.println((((p.position) + " ") + (p.score)));
        if (max < (p.score)) {
            max = p.score;
            pos = p.position;
        }
    }
    return pos;
}