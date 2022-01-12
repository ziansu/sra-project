private boolean checkHorizontal(int row, int col) {
    if (col <= ((board.length) - 3)) {
        if (((board[row][col]) == (board[row][(col + 1)])) && ((board[row][col]) == (board[row][(col + 2)]))) {
            java.lang.System.out.println("There is a win there");
            return true;
        }
    }
    return false;
}