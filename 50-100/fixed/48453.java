public void printSolution() {
    for (int row = 0; row < (board.length); row++) {
        java.lang.System.out.println("");
        for (int col = 0; col < (board[0].length); col++) {
            java.lang.System.out.print(((board[row][col]) + "\t"));
        }
    }
}