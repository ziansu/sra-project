public java.lang.String toString() {
    java.lang.String ans = "";
    for (int r = 2; r < ((board.length) - 2); r++) {
        for (int c = 2; c < ((board[r].length) - 2); c++) {
            ans += (board[r][c]) + "\t";
        }
        ans += "\n";
    }
    return ans;
}